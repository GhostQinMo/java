package FairyQin.HomeLove.DecoratorPoJO;

import FairyQin.HomeLove.AbstractRole.FastFood;
import FairyQin.HomeLove.AbstractRole.Garnish;

/**
 * @author Black_ghost
 * @title: Egg
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-26 16:41:29
 * @Description 具体装饰者类之一
 **/
public class Egg extends Garnish {


    public Egg( FastFood fastFood) {
        super(1,"加一个鸡蛋",fastFood);
    }
    @Override
    public float cost() {
        return getPrice()+ getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
