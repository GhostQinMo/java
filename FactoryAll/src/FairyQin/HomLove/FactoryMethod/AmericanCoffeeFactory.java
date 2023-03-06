package FairyQin.HomLove.FactoryMethod;

import FairyQin.HomLove.POJO.AmericanCoffee;
import FairyQin.HomLove.POJO.Coffee;

/**
 * @author Black_ghost
 * @title: AmericanCoffeeFactory
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:22:34
 * @Description
 **/
public class AmericanCoffeeFactory implements  AbstractFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
