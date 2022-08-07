package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Black_ghost
 * @title: microserverCloud_eureka01SpringApplication
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-07 16:42:04
 * @Description Eureka-server集群中的一个
 **/
@SpringBootApplication
@EnableEurekaServer   //通知springBoot该微服务可以用来注册其他微服务
public class microserverCloud_eureka01SpringApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(microserverCloud_eureka01SpringApplication.class, args);
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("eureka-7001主程序类产生了"+beanDefinitionCount+"个实例化类");
    }
}
