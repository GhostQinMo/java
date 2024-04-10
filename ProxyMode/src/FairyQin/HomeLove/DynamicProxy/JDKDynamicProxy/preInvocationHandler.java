package FairyQin.HomeLove.DynamicProxy.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * @Project Name : DesignModelAll
 * @Author ：AngelXin
 * @CreteTime：2024-04-10 19:42:17
 * @Description: @TODO
 * @Version：1.0
 */
public class preInvocationHandler implements InvocationHandler {
    private Person userinfo;
    public preInvocationHandler(Person userinfo){
        this.userinfo=userinfo;
    }
    @Override
    public Object invoke(Object proxy, Method method,Object ...args) throws InterruptedException{
        System.out.println("进入invoke方法...");
        Class<?> proxyclass = proxy.getClass();
        String proxyclassName = proxyclass.getName();
        System.out.println("proxyclassName = " + proxyclassName);
        System.out.println("正在验证用户是否登入");
        TimeUnit.SECONDS.sleep(5L);
        Object checkinfo="fail";
        try {
            System.out.println("args.toString() = " + Arrays.toString(args));
            checkinfo = method.invoke(userinfo,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkinfo;
    }
}
