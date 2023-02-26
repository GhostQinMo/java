package FairyQin.HomeLove.DecoratorPoJO;

import FairyQin.HomeLove.AbstractRole.FastFood;
import FairyQin.HomeLove.AbstractRole.Garnish;

/**
 * @author Black_ghost
 * @title: Bacon
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-26 16:53:13
 * @Description 具体装饰者角色之一
 **/
public class Bacon extends Garnish {
    public Bacon( FastFood fastFood) {
        super(2,"加一份培根", fastFood);
    }

    @Override
    public float cost() {
        return this.getPrice()+getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
