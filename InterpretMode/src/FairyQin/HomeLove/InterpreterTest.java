package FairyQin.HomeLove;

import FairyQin.HomeLove.AbstractExp.AbstractExpression;
import FairyQin.HomeLove.AbstractExp.AbstractImpl.Minus;
import FairyQin.HomeLove.AbstractExp.AbstractImpl.Plus;
import FairyQin.HomeLove.AbstractExp.AbstractImpl.Value;
import FairyQin.HomeLove.AbstractExp.AbstractImpl.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Black_ghost
 * @title: InterpreterTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 21:44:27
 * @Description 解释器模型测试
 *
 **/

//需求分析：需要实现1+2+3-4+5  使用解释器模式
public class InterpreterTest {
    public static void main(String[] args){
        //添加数据
        Variable a=new Variable("a");
        Variable b=new Variable("b");
        Variable c=new Variable("c");
        Variable d=new Variable("d");
        //创建环境角色实例
        Context context=new Context();
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //创建抽象语法树的表达式
        AbstractExpression abstractExpression=new Plus(new Minus(new Plus(a,new Plus(b,c)),d),new Value(5));
        System.out.println("abstractExpression = " + abstractExpression);
        Integer account = abstractExpression.interpreter(context);
        System.out.println("account= " + account);
    }
}
