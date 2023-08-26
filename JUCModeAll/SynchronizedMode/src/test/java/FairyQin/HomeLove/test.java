package FairyQin.HomeLove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Black_ghost
 * @title: test
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-08-20 16:38:25
 * @Description
 **/
@Slf4j
public class test {
    @Test
    public void test01(){
        AtomicInteger atomicInteger=new AtomicInteger(0);
        System.out.println(atomicInteger.getAndAccumulate(10, (x, y) -> {
            System.out.println("x="+x);
            System.out.println("y="+y);
            return x+y;
        }));
    }
}
