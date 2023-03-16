package FairyQin.HomeLove.BikeExample;

import FairyQin.HomeLove.BikeExample.AbstractBuilder.AbstractBuilder;

/**
 * @author Black_ghost
 * @title: Director
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-16 20:56:01
 * @Description 指挥者角色
 **/
public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }
    public Bike construct(){
        //具体组装的顺序应该交给指挥者类
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }
}
