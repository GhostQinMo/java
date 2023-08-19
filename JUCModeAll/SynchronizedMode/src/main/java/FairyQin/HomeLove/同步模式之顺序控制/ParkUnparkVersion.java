package FairyQin.HomeLove.同步模式之顺序控制;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Black_ghost
 * @title: ParkUnparkVersion
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-08-19 21:53:19
 * @Description 使用LockSupport的park()、unpark实现同步模式之顺序控制
 **/
@Slf4j
public class ParkUnparkVersion {
    //目标：必须先 2 后 1 打印（也就是按顺序执行某些任务）
    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            LockSupport.park(); //park被打断不会抛出异常，但是会设置打断标记（也就是不会清除打断标记）
            System.out.println("当前线程；" + Thread.currentThread() + "输入" + 1);
        }, "线程1");

        Thread thread2 = new Thread(() -> {
            System.out.println("当前线程；" + Thread.currentThread() + "输入" + 2);
            //唤醒thread1
            LockSupport.unpark(thread1);
        });
        thread1.start();
        thread2.start();
    }
}
