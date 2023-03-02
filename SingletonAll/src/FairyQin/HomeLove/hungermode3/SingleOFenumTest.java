package FairyQin.HomeLove.hungermode3;

import java.util.Arrays;

/**
 * @author Black_ghost
 * @title: SingleOFenumTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-01 22:18:53
 * @Description 枚举类实现单例模式测试+枚举类复习
 **/
public class SingleOFenumTest {
    public static void main(String[] args){
        HungerUser hungerUser1 = HungerUser.HUNGER_USER1;
        System.out.println("hungerUser1 = " + hungerUser1);
        String name = hungerUser1.name();
        System.out.println("hungerUser1.toString() = " + hungerUser1.toString());
        String s = hungerUser1.toString();
        System.out.println("===================");
        HungerUser hungerUser = Enum.valueOf(HungerUser.class, s);
        System.out.println("通过枚举的名字返回实例对象"+hungerUser.toString());
        int ordinal = hungerUser1.ordinal();
        System.out.println("hungerUser1位于枚举中的位置是"+ordinal);
        HungerUser[] values = hungerUser.values();
        String s1 = Arrays.toString(values);
        System.out.println("输出所有枚举对象"+s1);
        System.out.println("===================");
        System.out.println("hungerUser.compareTo(HungerUser.HUNGER_USER2) = " + hungerUser.compareTo(HungerUser.HUNGER_USER2));
    }
}
