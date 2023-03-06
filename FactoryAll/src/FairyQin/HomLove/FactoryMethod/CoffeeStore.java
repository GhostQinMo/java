package FairyQin.HomLove.FactoryMethod;

import FairyQin.HomLove.POJO.Coffee;
/**
 * @author Black_ghost
 * @title: CoffeeStore
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:13:35
 * @Description 商店
 **/
public class CoffeeStore {
    public  Coffee orderCoffee(String CoffeeName){
        if ("AmericanCoffee".equals(CoffeeName)){
            return  new AmericanCoffeeFactory().createCoffee();
        }else if ("LatteCoffee".equals(CoffeeName)){
            return  new LatteCoffeeFactory().createCoffee();
        }
        throw new RuntimeException("没有该类品");
    }
}
