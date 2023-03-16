package FairyQin.HomeLove.BikeExample.ConcreteBuilder;

import FairyQin.HomeLove.BikeExample.AbstractBuilder.AbstractBuilder;
import FairyQin.HomeLove.BikeExample.Bike;

/**
 * @author Black_ghost
 * @title: MobikeBuilder
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-16 20:52:44
 * @Description 具体构建者
 **/
public class OfoBuilder extends AbstractBuilder {
    @Override
    public void buildFrame() {
        System.out.println("创建Ofo Frame");
        this.bike.setFrame("Ofo Frame");
    }

    @Override
    public void buildSeat() {
        System.out.println("创建Ofo Seat");
        this.bike.setSeat("Ofo Seat");
    }

    @Override
    public Bike createBike() {
        //关于单车的组装顺序不能放在这里，应该放到指挥者类中（Director中），由指挥者类决定组装顺序
      /*  buildFrame();
        buildSeat();*/
        return this.bike;
    }


}
