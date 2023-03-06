package FairyQin.HomLove.ConfigFactory;

import FairyQin.HomLove.POJO.Coffee;
import org.junit.Assert;

/**
 * @author Black_ghost
 * @title: ConfigFactoryTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 11:33:18
 * @Description 配置工厂测试
 **/
//因为测试代码中需要使用到IO流，使用单元测试会报错
public class ConfigFactoryTest {
    public static void main(String[]args){
        Coffee americanCoffee = AmericanCoffeeFactory.getAmeircanCoffee("AmericanCoffee");
        Coffee americanCoffee1 = AmericanCoffeeFactory.getAmeircanCoffee("AmericanCoffee");
        System.out.println(americanCoffee.getName());
        americanCoffee.addSuge();
        americanCoffee.addMilk();
        Assert.assertEquals(americanCoffee,americanCoffee1);
        System.out.println(americanCoffee==americanCoffee1);
    }
}
