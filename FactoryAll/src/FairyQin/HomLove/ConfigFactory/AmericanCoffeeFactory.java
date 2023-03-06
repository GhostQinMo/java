package FairyQin.HomLove.ConfigFactory;

import FairyQin.HomLove.POJO.Coffee;
import com.sun.istack.internal.NotNull;
import org.junit.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Black_ghost
 * @title: AmericanCoffeeFactory
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 11:15:23
 * @Description 简单工厂+外部配置文件实现方式
 **/
public class AmericanCoffeeFactory {
    private static Map<String, Coffee > BeanMap;

    //实例外部配置文件只加载一次   这里可以认为是懒加载的
    static {
        BeanMap =new HashMap<>(5);
        //获取外部文件的输入流
        Properties properties = new Properties();
        InputStream resourceAsStream = AmericanCoffeeFactory.class.getClassLoader().getResourceAsStream("FairyQin/HomLove/ConfigFactory/bean.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            System.out.println("》》》》》》》》》》》》》》》》获取流失败");
            e.printStackTrace();
        } finally {
            try {
                Assert.assertNotNull(resourceAsStream);
                resourceAsStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Set<Object> objects = properties.keySet();
        System.out.println(objects);
        objects.forEach((o)->{
            String property = properties.getProperty((String) o);
            try {
                Class<Coffee> aClass = (Class<Coffee>) Class.forName(property);
                Coffee coffee = aClass.newInstance();
                BeanMap.put((String)o,coffee);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }


    //供外部获取coffee实体的方法
    public static Coffee getAmeircanCoffee(@NotNull String BeanName) {
        return  BeanMap.get(BeanName);
    }
}
