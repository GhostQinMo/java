package FairyQin.HomeLove;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.LongAdder;

/**
 * @Project Name : DesignModelAll
 * @Author ：AngelXin
 * @CreteTime：2024-03-30 16:23:22
 * @Description: 原子累加器性能测试
 * @Version：1.0
 */
@Slf4j
public class AtomicAccumulator {
    //使用泛型方法，将累加器和累加器的操作抽象出来，适应不同的原子类和其操作
    public static void main(String[] args) {
        LongAdder longAdder=new LongAdder();
    }


}
