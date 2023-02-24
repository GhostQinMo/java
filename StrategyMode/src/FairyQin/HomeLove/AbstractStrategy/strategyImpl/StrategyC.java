package FairyQin.HomeLove.AbstractStrategy.strategyImpl;

import FairyQin.HomeLove.AbstractStrategy.AbstractStrategy;

/**
 * @author Black_ghost
 * @title: StrategyA
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-24 20:12:47
 * @Description 具体策略角色之一
 **/
public class StrategyC implements AbstractStrategy {
    @Override
    public void show() {
        System.out.println("StrategyC》》》》会员日 85折");
    }
}
