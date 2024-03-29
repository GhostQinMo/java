##终止模式之两阶段终止模式

>在一个线程 T1 中如何“优雅”终止线程 T2？这里的【优雅】指的是给 T2 一个料理后事的机会。

###1.错误思路
- 使用线程对象的stop()方法停止线程
  - 存在的问题：stop方法会真正杀死线程，如果这时线程锁住了共享资源，那么当它被杀死后
    就再没有机会释放锁，其他线程将永远无法获取锁得到共享资源
- 使用System.exit(int)方法停止线程
  - 存在的问题：目的仅仅是停止一个线程，但是这种做法会让整个程序都停止

###2.两段终止模式
![image-20230217171205733](https://angelxinnotesimages.oss-cn-hangzhou.aliyuncs.com/JUC/image-20230217171205733.png)

####2.1.利用  isInterrupted
interrupt 可以打断正在执行的线程，无论这个线程是在 sleep，wait，还是正常运行

###3、使用Volatitle改进
- 为什么要使用volatile？
  - 由于线程之间的可见性，线程之间的数据是不可见的，所以需要使用volatile关键字来保证数据的可见性
两阶段终止模式是一种线程安全的终止模式，通过使用volatile变量来保证线程间的可见性。在传统的两阶段终止模式中，通常会使用一个标识变量来表示是否终止线程，但是在多线程环境下，使用volatile变量可以更好地保证其可见性。

以下是使用volatile改进的两阶段终止模式示例代码：

```java
public class TwoPhaseTermination {
  private volatile boolean terminated = false;

  public void start() {
    Thread thread = new Thread(() -> {
      while (!terminated) {
        // 线程执行的逻辑
        // 可以是一个循环任务或者其他操作（监控程序）

        // 检测线程是否被打断，如果是则退出循环
        if (Thread.currentThread().isInterrupted()) {
          System.out.println("线程被打断，退出循环");
          break;
        }
      }
    });
    thread.start();
  }

  public void stop() {
    terminated = true;
  }

  public static void main(String[] args) throws InterruptedException {
    TwoPhaseTermination tpt = new TwoPhaseTermination();
    tpt.start();

    // 模拟一段时间后停止线程
    Thread.sleep(5000);

    // 手动打断线程
    tpt.stop();
  }
}
```
在以上示例中，使用volatile修饰了`terminated`变量，确保了在一个线程修改了该变量的值后，其他线程能够立即看到修改后的值。这样可以更可靠地实现线程的终止。