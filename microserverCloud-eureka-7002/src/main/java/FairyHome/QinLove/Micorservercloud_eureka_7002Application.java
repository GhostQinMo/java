package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Black_ghost
 * @title: Micorservercloud_eureka_7002Application
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-07 20:24:01
 * @Description eureka集群中的一个
 **/
@SpringBootApplication
@EnableEurekaServer
public class Micorservercloud_eureka_7002Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Micorservercloud_eureka_7002Application.class, args);;
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("microservercloud-eurek7002初始化实例"+beanDefinitionCount+"个");
    }
}
