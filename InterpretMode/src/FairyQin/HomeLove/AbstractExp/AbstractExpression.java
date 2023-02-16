package FairyQin.HomeLove.AbstractExp;

import FairyQin.HomeLove.Context;

/**
 * @author Black_ghost
 * @title: AbstractExpression
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 21:06:19
 * @Description 解释器模式中的抽象表达式角色
 **/
public abstract class AbstractExpression {
    //解释抽象抽象表达式的规定   context是环境角色
    public  abstract Integer interpreter(Context context);

}
