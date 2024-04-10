package FairyQin.HomeLove.DynamicProxy.JDKDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Project Name : DesignModelAll
 * @Author ：AngelXin
 * @CreteTime：2024-04-10 19:55:17
 * @Description: @TODO
 * @Version：1.0
 */
public class JDKDynamicProxy {
    public static void main(String[] args){
        preInvocationHandler preInvocationHandler=new preInvocationHandler(new User("AngelXin 100000$"));
        Class[] intefaces={Person.class};
        Object proxyInstance = Proxy.newProxyInstance(JDKDynamicProxy.class.getClassLoader(), intefaces, preInvocationHandler);
        String s = proxyInstance.getClass().getName();
        System.out.println("代理类的实例是： " + s);
        Person person=(Person)proxyInstance;
        String checkUserInfo = person.checkUserInfo("123456");
        System.out.println("checkUserInfo = " + checkUserInfo);
    }
}
