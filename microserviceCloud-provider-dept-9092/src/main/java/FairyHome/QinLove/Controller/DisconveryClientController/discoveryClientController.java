package FairyHome.QinLove.Controller.DisconveryClientController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author Black_ghost
 * @title: disconveryClientController
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-07 21:36:51
 * @Description 用来响应微服务的info内容
 **/
//@Controller
@RestController
public class discoveryClientController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("/dept/discovery")
    public Object DisCovery(){
        List<String> services = discoveryClient.getServices();   //查询注册到Eureka注册中心的所有唯一id（即别称）
        System.out.println(services);
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVERCLOUD-DEPT");   //得到与该微服务名称相关联的所有的微服务信息
        for (ServiceInstance instance : instances) {
            System.out.println(instance.toString());
        }
        return discoveryClient;  //暴露改为服务的info信息
    }

}
