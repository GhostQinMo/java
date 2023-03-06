package FairyQin.HomeLove.DeepClone;

import FairyQin.HomeLove.JDKPrototypeMode.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Black_ghost
 * @title: DeepClone
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 20:38:04
 * @Description 使用对象流完成深克隆
 **/
public class DeepClone {
    public static void main(String[] args)throws  Exception {
        //创建原型对象用于深克隆使用
        PrototypeClass prototypeClass=new PrototypeClass(new User("FairyQin.HomeLove",23));
        //获取对象流输出流 打破单例模型也是用这种方法
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("F:\\AllWorkSpace\\DesignModelAll\\PrototypeMode\\src\\FairyQin\\HomeLove\\DeepClone\\bean.txt"));
        objectOutputStream.writeObject(prototypeClass);
        //获取对象输入流
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("F:\\AllWorkSpace\\DesignModelAll\\PrototypeMode\\src\\FairyQin\\HomeLove\\DeepClone\\bean.txt"));
        PrototypeClass prototypeClass1 = (PrototypeClass)objectInputStream.readObject();
        //验证是不是同一个属性
        System.out.println("prototypeClass1.getUser()==prototypeClass.getUser() = " + (prototypeClass1.getUser() == prototypeClass.getUser()));

    }
}
