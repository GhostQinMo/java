package FairyQin.HomeLove.lazyMode2;

import java.util.concurrent.TimeUnit;

/**
 * @author Black_ghost
 * @title: lazyMode1
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:47:09
 * @Description 单例模式之懒汉式synchronized解决线程安全，但是效率低
 **/
public class lazyMode2 {
    public String lazyUser;
    public boolean  on;
    //私有的构造方法
    private lazyMode2(String lazyUser, boolean on){
        this.lazyUser=lazyUser;
        this.on=on;
    }
    //静态的对象实例
    private static lazyMode2 lazyModeInstance=null;
    //创建供外部得到单实例的方法 设置为static的  加上synchronized关键字 解决线程安全问题 但是 synchronized效率低
    public static  synchronized lazyMode2 getInstance() throws InterruptedException {
        if (lazyModeInstance==null){
            //模拟线程安全问题
            TimeUnit.SECONDS.sleep(3);
            lazyModeInstance=new lazyMode2("fairyqinHomeLove",false);
        }
        return lazyModeInstance;
    }

    public String getLazyUser() {
        return lazyUser;
    }

    public boolean isOn() {
        return on;
    }
}
