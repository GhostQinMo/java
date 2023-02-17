package FairyQin.HomeLove.hungermode2;


import FairyQin.HomeLove.hungermode1.HungerMode1;
import com.sun.media.sound.SoftTuning;

/**
 * @author Black_ghost
 * @title: hungermode1test
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:34:21
 * @Description 饿汉式单例之静态代码块方式测试
 **/
public class hungermode2test {
    public static void main(String[] args) {
        HungerMode2 hungerMode2 = HungerMode2.getHungerMode1();
        System.out.println("hungerMode2.getAge() = " + hungerMode2.getAge());
        System.out.println("hungerMode2.getUsername() = " + hungerMode2.getUsername());
        HungerMode2 hungerMode21= HungerMode2.getHungerMode1();
        System.out.println(hungerMode21==hungerMode2);
    }
}
