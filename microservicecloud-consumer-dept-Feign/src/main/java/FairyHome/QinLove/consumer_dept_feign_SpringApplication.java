package FairyHome.QinLove;

import FairyHome.MyselfRule.MyLB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Black_ghost
 * @title: consumer_dept_SpringApplication
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-06 21:46:50
 * @Description 部门消费者的的启动主程序
 **/
@SpringBootApplication
@EnableEurekaClient   //程序启动自动注册到eureka集群中
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration =MyLB.class)
@EnableFeignClients(basePackages="FairyHome.QinLove")
public class consumer_dept_feign_SpringApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(consumer_dept_feign_SpringApplication.class, args);
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("部门消费者启动主程序容器中一共加载了========》》"+beanDefinitionCount+"个");
    }
}
