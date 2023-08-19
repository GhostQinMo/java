package FairyQin.HomeLove;

import java.util.concurrent.TimeUnit;

/**
 * @author Black_ghost
 * @title: TwoPhaseTermination
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 17:14:44
 * @Description 两阶段停止线程模式（并且会释放锁住的资源）
 **/

//需求是：设计一个监视CPU的线程，每两秒打出cpu数据
public class TwoPhaseTermination {
    private Thread thread;
    //线程开始的方法
    public  void start(){
//        thread=new Thread(){
//            @Override
//            public void run() {
//                super.run();
//            }
//        };
//         thread=new Thread(new Runnable() {
//             @Override
//             public void run() {
//
//             }
//         });
            thread=new Thread(() -> {
                Thread currentthread=Thread.currentThread();
                while(true){
                    if (currentthread.isInterrupted()){
                        //isInterrupted()方法判断线程是否被打断，不会清除打断标记（即不会设置线程的打断标记为false）
                        //没有引入slf4j使用sout代替
                        System.out.println("线程被打断，当前线程的状态是》》》"+currentthread.getState());
                        System.out.println("被打断的线程料理后事，一般为释放当前线程拥有的锁资源等");
                        //自动释放资源
                        break;
                    }else{
                        //使用jdk5新增的TimeUit类 代替Thread.sleep(),这里需要使用trycatch捕获睡眠中被打断的
                        try {
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("---------当前cup正常");   //如果运行这里被打断，不会抛出异常，但是下次循环是就会捕获打断标记跳出循环
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            System.out.println("睡眠中被打断");
                            //设置打断标记  下一次循环就会推出，线程结束
                            currentthread.interrupt();
                        }
                    }
                }
                System.out.println("线程跳出循环");
                System.out.println("线程被打断，当前线程的状态是》》》"+currentthread.getState());
            },"Cpu监控线程");
            //开始thread线程
            thread.start();

    }
    //打断线程的方法
    public  void stop() throws InterruptedException {
        //interrupt()方法打断sleep()/wait()/join()方法的线程，会抛出异常,并且会清除打断标记（即会设置线程的打断标记为false）
        //而interrupt()方法打断park()方法的线程，不会抛出异常，不会清除打断标记，会设置线程的打断标记为true
        thread.interrupt();
        TimeUnit.SECONDS.sleep(6);
        System.out.println("thread.getState() = " + thread.getState());
    }
}
