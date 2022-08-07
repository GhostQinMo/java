package FairyHome.QinLove.SpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Black_ghost
 * @title: ConfigBean
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-06 21:15:37
 * @Description 作为配置类像容器中添加组件，课代替配置spring的配置文件
 **/
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemlate(){
        //类似于JDBCTemplate 是用来暴露给浏览器的，用户通过浏览器来访问
//        RestTemplate提供了多种便捷访问远程Http服务的方法，
//        是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
        return new RestTemplate();
    }

}
