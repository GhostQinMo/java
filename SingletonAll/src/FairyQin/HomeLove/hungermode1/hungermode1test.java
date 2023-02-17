package FairyQin.HomeLove.hungermode1;

/**
 * @author Black_ghost
 * @title: hungermode1test
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:34:21
 * @Description 饿汉式单例之静态变量方式测试
 **/
public class hungermode1test {
    public static void main(String[] args) {
        HungerMode1 hungerMode1 = HungerMode1.getHungerMode1();
        System.out.println("hungerMode1.getAge() = " + hungerMode1.getAge());
        System.out.println("hungerMode1.getUsername() = " + hungerMode1.getUsername());
    }
}
