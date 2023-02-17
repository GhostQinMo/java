package FairyQin.HomeLove;

import java.util.concurrent.TimeUnit;

/**
 * @author Black_ghost
 * @title: TwoPhaseTerminationTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-17 17:48:15
 * @Description 两端打断线程测试
 **/
public class TwoPhaseTerminationTest {
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination twoPhaseTermination=new TwoPhaseTermination();
        twoPhaseTermination.start();
        TimeUnit.SECONDS.sleep(4);
        //打断线程
        twoPhaseTermination.stop();
    }
}
