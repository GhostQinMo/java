package FairyQin.HomLove.SimpleFactory;

import FairyQin.HomLove.POJO.Coffee;
import org.junit.Test;

/**
 * @author Black_ghost
 * @title: SimpleFactoryTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:24:15
 * @Description 简单工厂测试
 **/

public class SimpleFactoryTest {
    @Test
    public void test01(){
        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee americanCoffee = coffeeStore.orderCoffee("AmericanCoffee");
        String name = americanCoffee.getName();
        System.out.println("name = " + name);
        americanCoffee.addMilk();
        americanCoffee.addSuge();
    }
}
