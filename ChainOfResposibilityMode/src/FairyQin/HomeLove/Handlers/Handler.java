package FairyQin.HomeLove.Handlers;

import FairyQin.HomeLove.LeaveRequest;
import com.sun.xml.internal.bind.v2.TODO;

/**
 * @author Black_ghost
 * @title: Handler
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-01-07 23:00:40
 * @Description 责任链的抽象处理类(请假案例)
 **/
//需要将该类声明成抽象的类，因为在抽象类中需要声明抽象的方法
public abstract class Handler {
    //定义三个静态的类子类可以直接用，真实应用中可以使用枚举实现
    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SERVER=7;
    //numStart表示该领导可以处理的最小的假期时间，例如部门经理能处理的最小的假是1天
    private int numStart;
    //numEnd表示该领导可以处理的最大的假期时间，例如部门经理能处理的最大的请假时间为3天
    private int numEnd;
    //聚合该领导的上一级领导
    private Handler nextHandler;
    //设置该领导可以批的最小请假时间， 没有请假上限，这里构造方法是为了防止以后扩展使用
    public Handler(int numStart) {
        this.numStart = numStart;
    }
    //设置该领导可以批的假期区间
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }
    //TODO 这出现的当这个抽象类放到FairyQin.HomeLove路径下时报错，查,以前也出现过，好像是和idea工具有关
    //声明责任链中的后继者（在该案例中是设置当前领导的上一级领导）
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    //提交请假条的方法  用final修饰，禁止子类重写该方法
    public final void submit(LeaveRequest leaveRequest){
        if (leaveRequest.getNum()>numEnd && this.nextHandler!=null){
            this.nextHandler.submit(leaveRequest);
        }else{
            handlerLeave(leaveRequest);
            System.out.println("批准请假，恭喜请假成功");
        }
    }
    //处理请假条的方法，这里定义抽象的，具体实现由子类实现
    public abstract void handlerLeave(LeaveRequest leaveRequest);
}
