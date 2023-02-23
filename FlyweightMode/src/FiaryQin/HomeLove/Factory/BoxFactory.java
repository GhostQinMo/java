package FiaryQin.HomeLove.Factory;

import FiaryQin.HomeLove.AbstractBox.AbstractBox;
import FiaryQin.HomeLove.AbstractBox.AbstracterBoxImpl.IBox;
import FiaryQin.HomeLove.AbstractBox.AbstracterBoxImpl.LBox;
import FiaryQin.HomeLove.AbstractBox.AbstracterBoxImpl.OBox;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Black_ghost
 * @title: BoxFactory
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-23 20:50:46
 * @Description 享元工厂（提供享受享元对象的容器，共使用类获取）
 **/
//直接设置final  且不提供BoxFactory实例外用
public final class BoxFactory {
    //创建享元对象的容器
    //TO（已做）DO flyweights为初始化 记得做 否则报空指针错误
    private Map<String, AbstractBox> flyweights;

    //BoxFactroy只需一个，使用单例（内部类的模式）
    private BoxFactory() {
        //初始化容器  内部类实现了懒加载
        flyweights=new Hashtable<>();
        //初始化可共享的具体享元角色 并装入容器
        AbstractBox I=new IBox();
        AbstractBox L=new LBox();
        AbstractBox O=new OBox();
        flyweights.put("I",I);
        flyweights.put("L", L);
        flyweights.put("O",O);
    }

    //创建静态的私有的内部类实现BoxFactory单实例懒加载
    private static class getInstance {
        //工厂实例
        private static final BoxFactory BOX_FACTORY = new BoxFactory();
    }

//    //向外部提供享受元对象的方法  静态的方法已经可以保证子类不能重写该方法了，所以没有用final修饰了
//    public static BoxFactory getInstance() {
//        return getInstance.BOX_FACTORY;
//    }
    //通过输入的指定形状的方块 提供相对应的享元对象实例  这可以直接不提供工厂实例（BoxFactory）
    public static AbstractBox getBox(String shape){
        return getInstance.BOX_FACTORY.flyweights.get(shape);
    }

}
