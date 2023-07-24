package FairyQin.HomeLove.lazyMode3;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Black_ghost
 * @title: lazyMode1Test
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 21:58:40
 * @Description double-checked locking test
 **/

public class lazyMode3Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<lazyMode3> lazyMode2FutureTask = new FutureTask<>(lazyMode3::getInstance);
        Thread thread1=new Thread(lazyMode2FutureTask);
        thread1.start();
        lazyMode3 instance3=lazyMode3.getInstance();
        System.out.println("两次获取的单例对象是否相等 "+ (lazyMode2FutureTask.get()==instance3));
    }
}
