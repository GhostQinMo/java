package FairyQin.HomLove.SimpleFactory;

import FairyQin.HomLove.POJO.AmericanCoffee;
import FairyQin.HomLove.POJO.Coffee;
import FairyQin.HomLove.POJO.LatteCoffee;
import com.sun.istack.internal.NotNull;

/**
 * @author Black_ghost
 * @title: SimpleCoffeeFactory
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:08:26
 * @Description 简单工厂
 **/
public  class SimpleCoffeeFactory {

    public static Coffee getCoffee(@NotNull String CoffeeName){
        if ("AmericanCoffee".equals(CoffeeName)){
            return  new AmericanCoffee();
        }else if ("LatteCoffee".equals(CoffeeName)){
            return  new LatteCoffee();
        }
        throw new RuntimeException("没有该类品");
    }
}
