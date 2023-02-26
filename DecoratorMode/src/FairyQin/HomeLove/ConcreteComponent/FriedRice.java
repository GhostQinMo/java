package FairyQin.HomeLove.ConcreteComponent;

import FairyQin.HomeLove.AbstractRole.FastFood;

/**
 * @author Black_ghost
 * @title: FriedRice
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-26 16:37:39
 * @Description 具体构件角色（继承抽象构件角色）
 **/
public class FriedRice extends FastFood {

    /**
     * 因为是具体的构件类，关于具体的构件加强的方法由具体装饰着类来体现，所以这里根据情况提供构造方法参数 在该案例中不需要提供
     */
    public FriedRice() {
        super(12, "一份炒饭");
    }
    @Override
    public float cost() {
        return  this.getPrice();
    }
}
