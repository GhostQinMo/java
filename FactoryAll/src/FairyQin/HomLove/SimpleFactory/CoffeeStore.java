package FairyQin.HomLove.SimpleFactory;

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
        return SimpleCoffeeFactory.getCoffee(CoffeeName);
    }
}
