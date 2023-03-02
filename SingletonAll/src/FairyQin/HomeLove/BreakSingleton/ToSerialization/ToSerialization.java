package FairyQin.HomeLove.BreakSingleton.ToSerialization;

import FairyQin.HomeLove.lazyMode4.lazyMode4;
import com.sun.corba.se.pept.encoding.OutputObject;

import java.io.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Black_ghost
 * @title: ToSerialization
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-02 15:18:05
 * @Description 通过序列化破坏单例模型（除枚举方法）
 **/
public class ToSerialization {

    public static void main(String[] args)throws Exception{
        OutputObjectInstance();
        TimeUnit.SECONDS.sleep(1);
        Object o = InputObjectInstance();
        System.out.println("反序列化得到的对象是否是lazyMode4的对象:"+(o instanceof lazyMode4));
        lazyMode4 lazyMode4_1=(lazyMode4)o;
        lazyMode4 lazyMode4_2=(lazyMode4)InputObjectInstance();
        System.out.println("序列化两次获取到的对象是否相等：" + (lazyMode4_1==lazyMode4_2)) ;
    }
    /*  往文件中放入一个对象
     * */
    public static void OutputObjectInstance() throws Exception {
        OutputStream outputStream = new FileOutputStream("F:\\AllWorkSpace\\DesignModelAll\\SingletonAll\\src\\FairyQin\\HomeLove\\BreakSingleton\\ToSerialization\\object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        //静态内部类实现
        lazyMode4  Instance=lazyMode4.getInstance();
        objectOutputStream.writeObject(Instance);
    }
    /*
        反序列化一个对象
    * */
    public static Object InputObjectInstance() throws Exception{
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("F:\\AllWorkSpace\\DesignModelAll\\SingletonAll\\src\\FairyQin\\HomeLove\\BreakSingleton\\ToSerialization\\object.txt"));
        Object object = objectInputStream.readObject();
        return object;
    }
}
