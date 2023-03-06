package FairyQin.HomLove.AbstractFactory;

import FairyQin.HomLove.POJO.AmericanCoffee;
import FairyQin.HomLove.POJO.Coffee;
import FairyQin.HomLove.POJO.Dessert;
import FairyQin.HomLove.POJO.MatchaMousse;

/**
 * @author Black_ghost
 * @title: AmericanCoffeeFactory
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:22:34
 * @Description
 **/
public class AmericanCoffeeFactory implements AbstractFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return  new MatchaMousse();
    }
}
