package FairyQin.HomeLove.lazyMode1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author Black_ghost
 * @title: lazyMode1Test
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:58:40
 * @Description 测试懒汉式线程不安全模式，并模拟出不安全
 **/
public class lazyMode1Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        FutureTask<lazyMode1> lazyMode1FutureTask = new FutureTask<>(lazyMode1::getInstance);
        Thread thread1=new Thread(lazyMode1FutureTask);
        thread1.start();
        //22行代码不能放到线程开始前不然不会出现线程安全问题
        lazyMode1 instance2=lazyMode1.getInstance();
        System.out.println(instance2==lazyMode1FutureTask.get());  //输出结果为false
    }
}
