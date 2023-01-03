package FairyHome.QinLove;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;

/**
 * @author Black_ghost
 * @title: DesignModel
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-09-05 08:06:44
 * @Description 这个模块用于测试
 **/
public class DesignModel {
    @Test
    public void test01() throws Exception {
        /*Class<?> aClass = new Object().getClass();
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);*/
        String[] strings=new String[4];
        for (int i = 0; i < strings.length; i++) {
            strings[i]="fdsf"+i;
        }
        test02(strings);
    }
    public void test02(String ...strs){
        System.out.println(strs.length);
    }
}





















