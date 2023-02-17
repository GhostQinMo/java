package FairyQin.HomeLove.hungermode2;

/**
 * @author Black_ghost
 * @title: HungerMode1
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:23:29
 * @Description 饿汉式单例之静代码块方式
 **/
public class HungerMode2 {
    //私有的成员变量  属性不可更改
    private final String username;
    private final Integer age;
    //私有的构造方法
    private HungerMode2(String username, Integer age){
        this.username=username;
        this.age =age;
    }
    //创建私有的对象实例
    private static final HungerMode2 hungerMode1;
    //在静态代码块中对其赋值
    static{
        hungerMode1=new HungerMode2("Fairy",22);
    }

    //创建供外部得到单实例的方法 设置为static的 所以单实例也需要要是但是的
    public static HungerMode2 getHungerMode1(){
        return hungerMode1;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

}
