package FairyQin.HomeLove.BikeExample;

import FairyQin.HomeLove.BikeExample.ConcreteBuilder.MobikeBuilder;
import FairyQin.HomeLove.BikeExample.ConcreteBuilder.OfoBuilder;

/**
 * @author Black_ghost
 * @title: BuilderTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-16 21:01:25
 * @Description 构建者模式测试
 **/
public class BuilderTest {
    public static void main(String[] args){
        Director bikeDirector=new Director(new MobikeBuilder());
        Bike construct = bikeDirector.construct();
        bikeDirector=new Director(new OfoBuilder());
        Bike construct1 = bikeDirector.construct();
        System.out.println(construct1==construct);
    }
}
