package FairyQin.HomLove.FactoryMethod;

import FairyQin.HomLove.POJO.Coffee;

/**
 * @param null
 * @return null
 * @author Fairy_qin
 * @datetime 2023/3/6 9:22
 * @decription  抽象工厂角色
 * @throws
 */

public interface AbstractFactory {
     Coffee createCoffee();
}
