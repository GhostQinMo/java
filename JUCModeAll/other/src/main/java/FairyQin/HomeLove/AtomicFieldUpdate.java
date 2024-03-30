package FairyQin.HomeLove;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @Project Name : DesignModelAll
 * @Author ：AngelXin
 * @CreteTime：2024-03-30 16:12:35
 * @Description: @ 原子字段更新器
 * @Version：1.0
 */

public class AtomicFieldUpdate {
    public static void main(String[] args) {
        //User类的字段必须是volatile修饰符，且类型必须是int，不能是Integer
        AtomicIntegerFieldUpdater<User> atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(User.class, "age");
        User user = new User();
        user.setAge(0);
        boolean result = atomicIntegerFieldUpdater.compareAndSet(user, 0, 1);
        System.out.println(result);
    }
}
