package FairyQin.HomeLove;





import FairyQin.HomeLove.AbstractExp.AbstractImpl.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Black_ghost
 * @title: Context
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 21:10:44
 * @Description 解释器模式中的环境角色
 **/
public class Context {
    //环境角色需要提供一个容器来存储解释器使用的公共数据
    private Map<Variable,Integer>  map=new HashMap<>();


    //往环境中存放数据
    public void assign(Variable variable,Integer integer){
        map.put(variable,integer);
    }
    //从环境中取出数据
    public Integer getValue(Variable variable){
        return map.get(variable);
    }
}
