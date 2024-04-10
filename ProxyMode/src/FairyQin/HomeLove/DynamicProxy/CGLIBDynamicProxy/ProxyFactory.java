package FairyQin.HomeLove.DynamicProxy.CGLIBDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Black_ghost
 * @title: ProxyFactory
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-12-18 17:59:11
 * @Description 通过代理工厂获取JDK动态生成的代理对象,
 * 但是ProxyFactory并不是代理对象，而真正的代理对象是在内存中动态生成的
 **/
public class ProxyFactory {
    /**
     *
     * @param superClass
     * @return
     */
    public static WaterPOJO getProxyWaterPOJO(Class<WaterPOJO>  superClass){
        //创建CGLIB的Enhancer对象
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(superClass);
        //设置回调方法
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            /**
             * @param o 被代理对象
             * @param method 被代理对象的方法
             * @param objects 方法的参数
             * @param methodProxy 代理方法
             * @return
             * @throws Throwable
             */
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if (o instanceof WaterPOJO){
                    System.out.println("o instanceof WaterPOJO = "+ true);
                }
                System.out.println("o.getClass().getName() = " + o.getClass().getName());
                System.out.println("objects = " + Arrays.toString(objects));
                System.out.println("method.getName() = " + method.getName());
                System.out.println("methodProxy.getSuperName() = " + methodProxy.getSuperName());
                //执行被代理对象的方法，也就是执行父类的方法，这的返回值是父类方法的返回值
                 Object invoke1 = methodProxy.invokeSuper(o,objects);
                System.out.println("invoke1.getClass().getName() = " + invoke1.getClass().getName());
                return invoke1;
            }
        });
        //创建代理对象,这里的代理对象是在内存中动态生成的
         Object o1 = enhancer.create();
        System.out.println("o1.getClass().getName() = " + o1.getClass().getName());
        return (WaterPOJO)o1;
    }
}

