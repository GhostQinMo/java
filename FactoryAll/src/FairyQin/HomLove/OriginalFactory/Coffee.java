package FairyQin.HomLove.OriginalFactory;

/**
 * @author Black_ghost
 * @title: Coffee
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-12-13 16:44:00
 * @Description 没有使用工厂模式写的一个demo,引出没有使用工厂模式的缺点（首先就不符合 六大原则）
 **/
//需求：设计一个咖啡店点餐系统。
//设计一个咖啡类（Coffee），并定义其两个子类（美式咖啡【AmericanCoffee】和拿铁咖啡【LatteCoffee】）；
//再设计一个咖啡店类（CoffeeStore），咖啡店具有点咖啡的功能。
//具体类的设计如下：类图的位置在FairyQin/HomLove/OriginalFactory/photograph/工厂设计模式引入.png
    /*在java中，万物皆对象，这些对象都需要创建，如果创建的时候直接new该对象，
    就会对该对象耦合严重，假如我们要更换对象，所有new对象的地方都需要修改一遍，
    这显然违背了软件设计的开闭原则。如果我们使用工厂来生产对象，我们就只和工厂
    打交道就可以了，彻底和对象解耦，如果要更换对象，直接在工厂里更换该对象即可，
    达到了 与对象解耦的目的；所以说，工厂模式最大的优点就是：解耦。
    对象：这里所说的对象指的是具体的bean,例如这里的LetterCoffee|AmericanCoffee实例对象，
    这里的解耦是指caffee店与具体的caffee解耦（具体caffee包括LetterCoffee|AmericanCoffee）
    在本教程中会介绍三种工厂的使用
            * 简单工厂模式（不属于GOF的23种经典设计模式）
            * 工厂方法模式
            * 抽象工厂模式*/

public class Coffee {
}
