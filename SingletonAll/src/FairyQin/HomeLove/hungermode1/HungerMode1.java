package FairyQin.HomeLove.hungermode1;

/**
 * @author Black_ghost
 * @title: HungerMode1
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:23:29
 * @Description 饿汉式单例之静态变量方式
 **/
public class HungerMode1 {
    //私有的成员变量  属性不可更改
    private final String username;
    private final Integer age;
    //私有的构造方法
    private HungerMode1(String username, Integer age){
        this.username=username;
        this.age =age;
    }
    //创建私有的对象实例
    private static  HungerMode1 hungerMode1=new HungerMode1("Fairy",22);

    //创建供外部得到单实例的方法 设置为static的 所以单实例也需要要是但是的
    public static HungerMode1 getHungerMode1(){
        return hungerMode1;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

}
