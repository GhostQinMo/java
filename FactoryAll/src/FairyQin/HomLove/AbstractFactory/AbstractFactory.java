package FairyQin.HomLove.AbstractFactory;

import FairyQin.HomLove.POJO.Coffee;
import FairyQin.HomLove.POJO.Dessert;

/**
 * @param null
 * @return null
 * @author Fairy_qin
 * @datetime 2023/3/6 9:22
 * @decription  抽象工厂角色
 * @throws
 */

//定义各个工厂的生产的产品族   规划各个工厂的实现
public interface AbstractFactory {
     //coofee
     Coffee createCoffee();
     //dssert
     Dessert createDessert();

}
