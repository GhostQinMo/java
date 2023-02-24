package FairyQin.HomeLove;

import FairyQin.HomeLove.AbstractStrategy.strategyImpl.StrategyA;
import FairyQin.HomeLove.AbstractStrategy.strategyImpl.StrategyB;
import FairyQin.HomeLove.AbstractStrategy.strategyImpl.StrategyC;

/**
 * @author Black_ghost
 * @title: StrategyTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-24 20:24:34
 * @Description 策略模式的测试类
 **/
public class StrategyTest {
    public static void main(String[] args){
        //春节来了，使用春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("==============");
        //中秋节到了，使用中秋节的促销活动
        salesMan.setStrategyInstance(new StrategyB());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("==============");
        //圣诞节到了，使用圣诞节的促销活动
        salesMan.setStrategyInstance(new StrategyC());
        //展示促销活动
        salesMan.salesManShow();
    }
}
