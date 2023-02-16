package FairyQin.HomeLove.AbstractExp.AbstractImpl;

import FairyQin.HomeLove.AbstractExp.AbstractExpression;
import FairyQin.HomeLove.Context;

/**
 * @author Black_ghost
 * @title: Variable
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 21:25:27
 * @Description 终结符表达式角色之一
 **/
public class Variable extends AbstractExpression {
    private String name;
    public Variable(String name){
        this.name=name;
    }

    @Override
    public Integer interpreter(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
