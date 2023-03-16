package FairyQin.HomeLove.BikeExample.AbstractBuilder;

import FairyQin.HomeLove.BikeExample.Bike;

/**
 * @author Black_ghost
 * @title: AbstractBuilder
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-16 20:40:24
 * @Description 抽象构建者角色
 **/
public abstract class AbstractBuilder {
    /**
     *@param   bike  concrete produce
     * 这里注意需要初始化，不然容易空指针 ，最好是在没有初始化的地方 打上TODO*/
    //TODO 注意空指针
    protected Bike bike=new Bike();
    /**
     * 创建框架*/
    abstract public void buildFrame();

    /**
     * 创建座位*/
    abstract public void buildSeat();

    /**
     * 创建实例*/
    abstract public Bike createBike();

}
