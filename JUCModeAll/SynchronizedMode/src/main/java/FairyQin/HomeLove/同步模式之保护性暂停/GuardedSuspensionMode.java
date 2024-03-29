package FairyQin.HomeLove.同步模式之保护性暂停;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Black_ghost
 * @title: GuardedSuspensionMode
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-08-19 21:49:50
 * @Description JUC模式中的同步模式之保护性暂停（普通版本）
 **/
@Slf4j
public class GuardedSuspensionMode {
    /**
     * @description: 保护性暂停模式：该模式的作用是用来保证一个线程等待另一个线程的执行结果
     * @author: AngelXin
     * @date: 2024/3/28 17:30
     **/
    static class GuardedObject{
        private Object response;
        private final Object lock=new Object();
        /**
         * @description: 获取结果的方法，如果结果没有返回则等待，如果结果返回则返回结果
         * @author: AngelXin
         * @date: 2024/3/29 10:09
         * @param: []
         * @return: java.lang.Object
         **/
        public Object get() {
            synchronized(lock) {
                while (response == null) {
                    try {
                        lock.wait(); // wait会释放锁
                    } catch (InterruptedException e) {
                        log.error("线程中断异常");
                    }
                }
                return response;
            }
        }
        /**
         * @description: 计算赋值
         * @author: AngelXin
         * @date: 2024/3/29 10:12
         * @param: [response]
         * @return: void
         **/
        public void complete(Object response){
            synchronized(lock){
                this.response=response;
                lock.notifyAll();
            }
        }
    }

    /**
     * @description: 测试保护性暂停
     * @author: AngelXin
     * @date: 2024/3/29 10:14
     * @param: [args]
     * @return: void
     **/
    public static void main(String[] args){
        GuardedObject guardedObject=new GuardedObject();
        Thread getThread=new Thread(()->{
            log.info("等待计算");
            guardedObject.complete("10");
            log.info("计算结束");
        },"计算线程");
        getThread.start();
        // 主线程阻塞等待
        log.info("等待结果");
        Object result = guardedObject.get();
        log.info("结果为：{}",result);
    }
}
