package FairyQin.HomeLove.JDKPrototypeMode;

import java.util.Arrays;

/**
 * @author Black_ghost
 * @title: JDKPrototypeTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 19:52:14
 * @Description jdk Clone方法提供的原型模式测试
 **/
public class JDKPrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        RealizeType realizeType=new RealizeType("FairyQin.HomeLove",new String[]{"love","love","love"},new User("啦啦啦",22));
        RealizeType realizeType1=(RealizeType)realizeType.clone();
        System.out.println(realizeType1.toString());
        //根据原型克隆出一个对象  这里是浅克隆，对于对象中的非基本类型的属性和String类型属性 两个实例还是用同一个内存地址
        String[] hobby = realizeType.getHobby();
        String[] hobby1 = realizeType1.getHobby();
        //非基本类型和String类型  String[]  浅克隆使用同一个内存地址
        System.out.println("hobby==hobby1 = " + (hobby == hobby1));

        //浅克隆存在的问题，就是对非基本类型或者非String类型的属性使用相同的内存地址
        String[] hobby2 = realizeType.getHobby();
        System.out.println("realizeType1.getHobby() = " + Arrays.toString(realizeType1.getHobby()));
        for (int i = 0; i < hobby2.length; i++) {
          //通过原型或者克隆的对象可以改变另一个对象实例中的某些属性值，导致前者在不知情的情况下使用了错误的数据
            hobby2[i]="new"+hobby2[i];
        }
        System.out.println("realizeType1.getHobby() = " + Arrays.toString(realizeType1.getHobby()));

    }
}
