package FairyQin.HomeLove;

import lombok.extern.slf4j.Slf4j;
import sun.misc.Unsafe;

/**
 * @Project Name : JUCModeAll
 * @Author ：AngelXin
 * @CreteTime：2024-03-30 17:03:28
 * @Description: 通过反射获取Unsafe对象
 * @Version：1.0
 */
@Slf4j
public class FetchUnsafe {
    //Unsafe提供了非常底层的操作，如内存管理、线程管理、CAS操作等,java8 Unsafe提供了getUnsafe方法直接获取
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Unsafe unsafe = Unsafe.getUnsafe();
    }
}
