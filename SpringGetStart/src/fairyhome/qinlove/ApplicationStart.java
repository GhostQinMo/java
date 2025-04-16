package fairyhome.qinlove;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project Name : Spring5WorkSpace
 * @Author ：AngelXin
 * @CreteTime：2022-04-17 04:12:41
 * @Description: spring get start
 * @Version：1.0
 */
public class ApplicationStart {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("fairyhome/qinlove/config/UserBean.xml");
        User user = (User)classPathXmlApplicationContext.getBean("user");
        user.init();
    }
}
