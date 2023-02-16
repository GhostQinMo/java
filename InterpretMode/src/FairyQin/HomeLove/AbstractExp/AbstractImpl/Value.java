package FairyQin.HomeLove.AbstractExp.AbstractImpl;

import FairyQin.HomeLove.AbstractExp.AbstractExpression;
import FairyQin.HomeLove.Context;

/**
 * @author Black_ghost
 * @title: Value
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 21:42:23
 * @Description 终结符表达式之一
 **/
public class Value extends AbstractExpression {
    private Integer integer;

    public Value(Integer integer) {
        this.integer = integer;
    }

    @Override
    public Integer interpreter(Context context) {
        return this.integer;
    }

    @Override
    public String toString() {
        return  integer.toString();
    }
}
