package FairyQin.HomeLove.AbstractExp.AbstractImpl;

import FairyQin.HomeLove.AbstractExp.AbstractExpression;
import FairyQin.HomeLove.Context;

/**
 * @author Black_ghost
 * @title: Minus
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 21:38:30
 * @Description 非终结符表达式角色之一
 **/
public class Minus extends AbstractExpression {
    private AbstractExpression left;
    private  AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpreter(Context context) {
        return left.interpreter(context) - right.interpreter(context);
    }

    @Override
    public String toString() {
        return left.toString()+"-"+right.toString();

    }
}
