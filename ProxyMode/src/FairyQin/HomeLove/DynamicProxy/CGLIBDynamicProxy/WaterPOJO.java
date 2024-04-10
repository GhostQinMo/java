package FairyQin.HomeLove.DynamicProxy.CGLIBDynamicProxy;

/**
 * @author Black_ghost
 * @title: WaterPOJO
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-08-27 15:53:40
 * @Description 被代理的对象
 **/
public class WaterPOJO {
    /**
     *  一个简单类，模拟被代理的对象
     * @param storage 水的容量
     * @param temperature  水的温度
     */
    public int inputWater(int storage,Double temperature){
        System.out.println("水的容量"+storage+":"+"水的温度"+temperature);
        return 1;
    }
}
