package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Black_ghost
 * @title: microservicecloud_consumer_hystrix_dashboard
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-18 10:23:15
 * @Description 用于构建hystrixdashboard (服务监控功能)
 **/
@SpringBootApplication
@EnableHystrixDashboard             //开启可视化hystrixdashboard(服务监控功能)
public class microservicecloud_consumer_hystrix_dashboard {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(microservicecloud_consumer_hystrix_dashboard.class, args);
        System.out.println("hystrixdashboard启动ioc容器中加载了"+run.getBeanDefinitionCount()+"个实例");
    }
}
