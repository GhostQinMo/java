package FiaryQin.HomeLove;

import FiaryQin.HomeLove.AbstractBox.AbstractBox;
import FiaryQin.HomeLove.Factory.BoxFactory;

/**
 * @author Black_ghost
 * @title: FlyWeightTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-23 21:08:36
 * @Description 享元模式案例测试
 **/
public class FlyWeightTest {
    public static void main(String[] args){
        //获取I图形对象
        AbstractBox box1 = BoxFactory.getBox("I");
        box1.display("灰色");

        //获取L图形对象
        AbstractBox box2 = BoxFactory.getBox("L");
        box2.display("绿色");

        //获取O图形对象
        AbstractBox box3 = BoxFactory.getBox("O");
        box3.display("灰色");

        //获取O图形对象
        AbstractBox box4 = BoxFactory.getBox("O");
        box4.display("红色");

        System.out.println("两次获取到的O图形对象是否是同一个对象：" + (box3 == box4));
    }
}
