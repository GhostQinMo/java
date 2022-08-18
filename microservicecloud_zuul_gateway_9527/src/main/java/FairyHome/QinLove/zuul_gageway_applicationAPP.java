package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Black_ghost
 * @title: zuul_gageway_applicationAPP
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-18 16:54:14
 * @Description zuul路由网关
 **/

@SpringBootApplication
@EnableZuulProxy
public class zuul_gageway_applicationAPP {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(zuul_gageway_applicationAPP.class, args);
        System.out.println("zuul路由网关启动类初始化了"+run.getBeanDefinitionCount()+"个实例");
    }
}
