package FiaryQin.HomeLove.AbstractBox;

/**
 * @author Black_ghost
 * @title: AbstractBox
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-23 20:36:04
 * @Description 抽象享元角色
 **/
public interface AbstractBox {
    //获取享元对象 具体享元对象需要重写该方法 (内部数据)  俄罗斯方块的形状是固定的
    public abstract String getShape();

    //该方法提供用于获取外部数据  俄罗斯方块的颜色是改变的
    default void display(String color) {
        System.out.println("形状是：" + getShape() + "颜色是：" + color);
    }
}
