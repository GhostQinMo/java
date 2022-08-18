package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author Black_ghost
 * @title: microserviceCloud_provider_dept_hystris9001
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-09 22:44:05
 * @Description 用来测是hystrix 服务熔断 充当eureka-server  注册中心
 **/

@SpringBootApplication
@EnableCircuitBreaker        //对hystrix熔断机制的支持
@EnableEurekaClient             //如果没有在eureka的监控页面上出现该服务的话  就是这个注解忘记写了☠
@EnableDiscoveryClient          //启动服务发现
public class microserviceCloud_provider_dept_hystrix9001 {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(microserviceCloud_provider_dept_hystrix9001.class, args);
        System.out.println("服务熔断服务端一共加载了多少"+run.getBeanDefinitionCount()+"个实例化类");
    }
}
