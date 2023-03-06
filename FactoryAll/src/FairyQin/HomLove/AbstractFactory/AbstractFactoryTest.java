package FairyQin.HomLove.AbstractFactory;

import org.junit.Test;

/**
 * @author Black_ghost
 * @title: AbstractFactoryTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 10:05:04
 * @Description 抽象工厂测试
 **/
public class AbstractFactoryTest {
    @Test
    public void Test01() {
        // 创建商店
        CoffeeStore instance = CoffeeStore.getInstance();
        //商店使用具体工厂提供的一系列产品族
        instance.setAbstractFactory(new AmericanCoffeeFactory());
        instance.getCoffee().getDessert();
        System.out.println("=====================");
        instance.setAbstractFactory(new LatteCoffeeFactory());
        instance.getCoffee().getDessert();
        System.out.println("\n\n");
        /*
        买到第一个工厂的coffee 买到第二个工厂的dessert;  当然这里可以使用泛型+函数式编程
        * */
        instance.getCoffee().setAbstractFactory(new LatteCoffeeFactory()).getDessert();


    }
}
