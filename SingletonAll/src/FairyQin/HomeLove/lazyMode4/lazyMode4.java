package FairyQin.HomeLove.lazyMode4;


import java.io.Serializable;

/**
 * @author Black_ghost
 * @title: lazyMode3
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-01 21:01:17
 * @Description 静态内部类实现单例模式
 **/

public class lazyMode4 implements Serializable {
    /*
    为了测试通过反序列化打破除枚举方式之外的单例模式
    * */
    public static final long SERIALIZATIONUID = -6949094470754667710L;
    public String name;
    public int age;
    private lazyMode4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //静态内部类  由于类对象只会被加载一次  该内部类只会只会被加载一次 不选考虑安全问题 JVM保障了
    private static class Supply{
        private static final lazyMode4 INSTANCE=new lazyMode4("fairyhome",22);
    }
    //供外部获取单例对象的方法
    public static  lazyMode4 getInstance(){
        return Supply.INSTANCE;
    }

    /*  添加readResolve方法 禁止反序列化破坏单例
    * */
    public Object readResolve(){
        return Supply.INSTANCE;
    }

}
