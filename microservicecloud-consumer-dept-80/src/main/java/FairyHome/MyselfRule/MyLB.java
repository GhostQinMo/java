package FairyHome.MyselfRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author Black_ghost
 * @title: MyLB
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-08 20:26:55
 * @Description 自定义的负载均衡算法
 **/
public class MyLB extends AbstractLoadBalancerRule {

    //通过改写RodomRule实现自定义Rule（负载均衡策略）
    private int count=0;   //表示一个负载均衡中的一个微服务执行的次数
    private int total=0;      //表示能

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                /*
                 * No servers. End regardless of pass, because subsequent passes
                 * only get more restrictive.
                 */
                return null;
            }
            if (count<5){
                count++;
               server=upList.get(total);
            }else{
                total++;
                count=0;
                if(total==serverCount){
                    total=0;
                }
            }


            if (server == null) {
                /*
                 * The only time this should happen is if the server list were
                 * somehow trimmed. This is a transient condition. Retry after
                 * yielding.
                 */
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;

    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
        // TODO Auto-generated method stub

    }
}
