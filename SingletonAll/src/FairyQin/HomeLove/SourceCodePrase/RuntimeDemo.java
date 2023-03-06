package FairyQin.HomeLove.SourceCodePrase;

import java.io.InputStream;

/**
 * @author Black_ghost
 * @title: RuntimeDemo
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-04 08:28:23
 * @Description 源码单例 Runtime 使用
 **/
public class RuntimeDemo {
    public static void main(String[] args) throws Exception{
        //获取当前程序的runtime实例
        final Runtime runtime = Runtime.getRuntime();
        final Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime1==runtime);
        Process ipconfig = runtime.exec("ipconfig");
        byte[] source=new byte[1024*500*1024];
        InputStream inputStream = ipconfig.getInputStream();
        int read = inputStream.read(source);
        //运行系统指定
        System.out.println("ipconfig\n" + new String(source,0,read,"GBK"));
        //获取虚拟机可用的处理器数
        int i = runtime.availableProcessors();
        System.out.println("虚拟机可用的处理器数是："+i);
        //虚拟机可用内存量
        long l = runtime.freeMemory();
        System.out.println("  虚拟机可用内存量>>>>"+l/1024/1024);
        System.out.println("虚拟机可使用的最大内存"+runtime.maxMemory()/1024/1024);
        System.out.println("虚拟机中内存总量："+runtime.totalMemory()/1024/1024);

    }
}
