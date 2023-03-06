package FairyQin.HomLove.AbstractFactory;

import FairyQin.HomLove.POJO.Coffee;
import FairyQin.HomLove.POJO.Dessert;
import FairyQin.HomLove.POJO.LatteCoffee;
import FairyQin.HomLove.POJO.Tiramisu;

/**
 * @author Black_ghost
 * @title: AmericanCoffeeFactory
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:22:34
 * @Description 具体工厂
 **/
public class LatteCoffeeFactory implements AbstractFactory {
    @Override
    public   Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return  new Tiramisu();
    }
}
