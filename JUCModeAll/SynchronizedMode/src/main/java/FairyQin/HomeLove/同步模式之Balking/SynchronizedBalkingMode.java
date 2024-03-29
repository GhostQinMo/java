package FairyQin.HomeLove.同步模式之Balking;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Black_ghost
 * @title: SynchronizedBalkingMode
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-08-20 13:08:41
 * @Description 同步模式之Balking：该模式的作用是用来保证一个方法只执行一次
 * Balking （犹豫）模式用在一个线程发现另一个线程或本线程已经做了某一件相同的事，那么本线程就无需再做了，直接结束返回
 **/
@Slf4j
public class SynchronizedBalkingMode {
    public static void main(String[] args) {
        SynchronizedBalkingMode balkingMode=new SynchronizedBalkingMode();
        balkingMode.start();
        balkingMode.start();
        balkingMode.start();
    }
    //设置启动表示，并用volatile标识，使用JMM保证flag的可见性
    private  volatile Boolean flag=false;
    public void start(){
        //保证指令的原子性
        synchronized (this){
//            System.out.println(this.getClass().getName());
            if (!flag){
                System.out.println("唯一任务启动");
            }else {
                System.out.println("唯一任务已经启动！！");
                return;
            }
            flag=true;
        }
    }
}
