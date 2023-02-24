package FairyQin.HomeLove;

import FairyQin.HomeLove.AbstractStrategy.AbstractStrategy;

/**
 * @author Black_ghost
 * @title: SalesMan
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-24 20:16:55
 * @Description 策略模式中的环境类
 **/
public class SalesMan {
    //策略管理者持有抽象策略角色的引用
    public AbstractStrategy strategyInstance;

    //用户可以通过这个类使用所有的具体策略
    public SalesMan(AbstractStrategy strategyInstance) {
        this.strategyInstance = strategyInstance;
    }

    //执行具体策略
    public void salesManShow() {
        strategyInstance.show();
    }

    //提供策略get set方法
    public AbstractStrategy getStrategyInstance() {
        return strategyInstance;
    }

    public void setStrategyInstance(AbstractStrategy strategyInstance) {
        this.strategyInstance = strategyInstance;
    }
}
