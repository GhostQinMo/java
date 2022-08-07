package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Black_ghost
 * @title: micro"servercloud_eureka_7003Application
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-07 20:20:36
 * @Description eureka集群中的一个
 **/

@SpringBootApplication
@EnableEurekaServer
public class microservercloud_eureka_7003Application {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(microservercloud_eureka_7003Application.class, args);
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("microservercloud_eureka_7003Application初始化实例类："+beanDefinitionCount+"g个");
    }
}
