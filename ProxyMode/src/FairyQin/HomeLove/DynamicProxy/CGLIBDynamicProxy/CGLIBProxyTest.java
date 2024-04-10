package FairyQin.HomeLove.DynamicProxy.CGLIBDynamicProxy;

/**
 * @author Black_ghost
 * @title: CGLIBProxyTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-08-27 16:07:53
 * @Description CGLIB动态代理测试
 **/
public class CGLIBProxyTest {
    public static void main(String[] args) {
        //获取代理对象
        WaterPOJO proxyWaterPOJO = ProxyFactory.getProxyWaterPOJO(WaterPOJO.class);
        //执行代理对象的方法
        proxyWaterPOJO.inputWater(100, 20.0);
    }
}
