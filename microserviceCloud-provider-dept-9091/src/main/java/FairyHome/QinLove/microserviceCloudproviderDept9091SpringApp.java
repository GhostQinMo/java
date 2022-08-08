package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Black_ghost
 * @title: microserviceCloudproviderDept9090SpringApp
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-06 20:15:40
 * @Description microserviceCloud_provider_dept的springboot的启动类
 **/
@SpringBootApplication
@EnableEurekaClient   //该注解必须有  启动后改微服务自动注册到eureka-server微服务上（即注册中心）
@EnableDiscoveryClient  //启动服务发现
public class microserviceCloudproviderDept9091SpringApp {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(microserviceCloudproviderDept9091SpringApp.class, args);
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("microserviceCloudprovideDept9091微服务一共初始化了"+beanDefinitionCount +"个实例化类");

        //DevToolsProperties.Livereload    //:2022-08-06 22:08:44.324  WARN 25928  : Unable to start LiveReload server
        //启动时报liveReload 这个实例化类会占用一个端口，这个端口可以会产生冲突，在配置文件中改变该端口即可  spring.devtools.livereload.port=35730
    }
}
