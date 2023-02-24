package FairyQin.HomeLove.AbstractStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Black_ghost
 * @title: AbstractStrategy
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-24 20:08:07
 * @Description 抽象策略（strategy）角色定义抽象的策略方法
 **/
@FunctionalInterface
public interface AbstractStrategy {
    //所有子类需要重写的方法，定义规范，具体策略的实现由子类实现
    //这里只是模拟策略模式案例 还可以使用泛型
    public abstract void show();
}
