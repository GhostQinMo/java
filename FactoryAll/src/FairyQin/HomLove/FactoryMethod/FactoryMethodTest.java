package FairyQin.HomLove.FactoryMethod;


import FairyQin.HomLove.POJO.Coffee;
import org.junit.Test;
/**
 * @author Black_ghost
 * @title: FactoryMethodTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:29:02
 * @Description 简单工厂测试
 **/
public class FactoryMethodTest {
    @Test
    public  void  Test01(){
        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee americanCoffee = coffeeStore.orderCoffee("AmericanCoffee");
        System.out.println(americanCoffee.getName());
        americanCoffee.addSuge();
        americanCoffee.addMilk();

    }
}
