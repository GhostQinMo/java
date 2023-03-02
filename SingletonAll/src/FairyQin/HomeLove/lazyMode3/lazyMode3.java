package FairyQin.HomeLove.lazyMode3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Black_ghost
 * @title: lazyMode3
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-01 21:01:17
 * @Description double-checked locking  提高单例访问并发量
 **/

public class lazyMode3 {
    public String name;
    public int age;
    private  lazyMode3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private volatile static  lazyMode3 INSTANCE;

    public static lazyMode3 getInstance(){
        if (null == INSTANCE){
            //使用的volatile可以保证读取是内存中的 而不是缓存的
          synchronized (lazyMode3.class){
              if (null ==INSTANCE){
                  INSTANCE=new lazyMode3("FairyQin",22);
              }
          }
        }
        return INSTANCE;
    }


}
