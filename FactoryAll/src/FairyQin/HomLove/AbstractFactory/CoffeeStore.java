package FairyQin.HomLove.AbstractFactory;

import FairyQin.HomLove.POJO.Coffee;
import FairyQin.HomLove.POJO.Dessert;

import java.io.Serializable;

/**
 * @author Black_ghost
 * @title: CoffeeStore
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:58:11
 * @Description coffeestore   这里使用静态内部类创建单例工厂
 **/
public class CoffeeStore implements Serializable {
    public static final long SerializableUID = 11256324523423L;

    private AbstractFactory abstractFactory;

    private CoffeeStore() {
    }

    //通过set方法改变该store拥有的具体的工厂   单例只保证只有一个CoffeeStore但是单例类中的属性不变
    /*  set方法实现链式变成，使得客户可以买到其他厂家生产的产品族
    * */
    public CoffeeStore setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
        return this;
    }

    //这里添加milk 和 Suge本来应该按照客户需求来实现的  可以使用装饰者模式 实现链式编程来实现 附加功能的添加
    public CoffeeStore getCoffee() {
        Coffee coffee = abstractFactory.createCoffee();
        System.out.println(coffee.getName());
        coffee.addMilk();
        coffee.addSuge();
        return this;
    }

    public CoffeeStore getDessert() {
        Dessert dessert = abstractFactory.createDessert();
        dessert.getDessert();
        return this;
    }

    //静态内部类创建商店
    private static class Store {
        public static CoffeeStore coffeeStore = new CoffeeStore();
    }


    //共外部获取单例商店
    public static CoffeeStore getInstance() {
        return  Store.coffeeStore;
    }
}
