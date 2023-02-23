##Guarded Suspension (同步模式之保护性暂停模式)

###定义：
**作用**：用在一个线程等待另一个线程的执行结果

**要点**
- 有一个结果需要从一个线程传递到另一个线程，让他们关联同一个 GuardedObject
- 如果有结果不断从一个线程到另一个线程那么可以使用消息队列（见生产者/消费者）
- JDK 中，join 的实现、Future 的实现，采用的就是此模式(保护性暂停模式 Guarded suspension)
- 因为要等待另一方的结果，因此归类到同步模式
----
**关系图：**
![image-20230218224421773](https://cdn.staticaly.com/gh/GhostQinMo/ImageBed@master/ImagesJUC/image-20230218224421773.png)