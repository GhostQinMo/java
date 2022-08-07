package FairyHome.QinLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class consumer_dept_SpringApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(consumer_dept_SpringApplication.class, args);
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("部门消费者启动主程序容器中一共加载了========》》"+beanDefinitionCount+"个");
    }
}
