package FairyQin.HomeLove;

import lombok.Data;

/**
 * @Project Name : DesignModelAll
 * @Author ：AngelXin
 * @CreteTime：2024-03-30 16:01:33
 * @Description: @TODO
 * @Version：1.0
 */

@Data
public class User {
    // 在测试AtomicIntegerFieldUpdater时，必须使用volatile修饰符，且类型必须是int，不能是Integer
    public volatile int age;
}
