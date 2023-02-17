package FairyQin.HomeLove.lazyMode2;

import FairyQin.HomeLove.lazyMode1.lazyMode1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Black_ghost
 * @title: lazyMode1Test
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:58:40
 * @Description 测试懒汉式线程不安全模式，并模拟出不安全
 **/
public class lazyMode2Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        FutureTask<lazyMode2> lazyMode2FutureTask = new FutureTask<>(lazyMode2::getInstance);
        Thread thread1=new Thread(lazyMode2FutureTask);
        thread1.start();
        //使用sychronized解决线程安全问题
        lazyMode2 instance2=lazyMode2.getInstance();
        System.out.println(instance2==lazyMode2FutureTask.get());  //true
    }
}
