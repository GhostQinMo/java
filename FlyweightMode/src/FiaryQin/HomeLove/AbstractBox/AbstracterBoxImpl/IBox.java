package FiaryQin.HomeLove.AbstractBox.AbstracterBoxImpl;

import FiaryQin.HomeLove.AbstractBox.AbstractBox;

/**
 * @author Black_ghost
 * @title: IBox
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-23 20:45:44
 * @Description I形状的俄罗斯方块  具体享元（享元对象）
 **/
public class IBox implements AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
