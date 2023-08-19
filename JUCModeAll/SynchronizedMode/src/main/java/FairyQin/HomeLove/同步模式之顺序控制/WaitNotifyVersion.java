package FairyQin.HomeLove.同步模式之顺序控制;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Black_ghost
 * @title: WaitNotifyVersion
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-08-19 21:21:59
 * @Description 使用Wait Notify实现同步模式之顺序控制
 **/
@Slf4j
public class WaitNotifyVersion {
    //目标：必须先 2 后 1 打印（也就是按顺序执行某些任务）
    //锁对象
    private final static Object lock=new Object();
    //表示任务2已经执行完了
    private static boolean flag=false;
    public static void main(String[] args) {
        //线程一执行打印1
        Thread thread1=new Thread(){
            @Override
            public void run() {
                //加锁
                synchronized (lock){
                    while (true){
                        //判断任务2是否已经执行完了
                        if (!flag){
                            //如果没有执行完，释放锁
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                //被打断，但是这里没有使用两阶段打断了
                                log.error("{}被打断！！！",Thread.currentThread().getName());
                                e.printStackTrace();
                            }
                        }else {
                            //执行任务
                            System.out.println(Thread.currentThread().getName()+"输出"+1);
                            //退出循环
                            break;
                        }
                    }
                }
            }
        };

        //线程2
        Thread thread2=new Thread(){
            @Override
            public void run(){
             //获取锁，没有获取锁的话直接等待到锁被获取
                synchronized (lock){
                    //执行任务
                    System.out.println(Thread.currentThread().getName()+"输出"+2);
                    flag=true;
                    //唤醒其他waitset中的线程
                    lock.notifyAll();
                }
            }
        };

        thread1.setName("任务1");
        thread2.setName("任务2");
        thread1.start();
        thread2.start();
    }

    //分析：wait notify不好的地方
    /*
    首先，需要保证先 wait 再 notify，否则 wait 线程永远得不到唤醒。因此使用了『运行标记』来判断该不该wait
    第二，如果有些干扰线程错误地 notify 了 wait 线程，条件不满足时还要重新等待，使用了 while 循环来解决此问题
    最后，唤醒对象上的 wait 线程需要使用 notifyAll，因为『同步对象』上的等待线程可能不止一个
    //请看：LockSupport类的lock和unlock实现顺序控制，可以避免wait notify这些问题
    * */
}
