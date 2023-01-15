package FairyQin.HomeLove;

import FairyQin.HomeLove.Handlers.GeneralManager;
import FairyQin.HomeLove.Handlers.GroupLeader;
import FairyQin.HomeLove.Handlers.Manager;

/**
 * @author Black_ghost
 * @title: Test
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-01-15 23:03:43
 * @Description 责任链设计模型的测试类
 **/
public class Test {
    public static void main(String[] args){
        //1.创建请假条实例   注意请假天数需要在合理的范围类
        LeaveRequest leaveRequest=new LeaveRequest("FairyHome",1,"巡光");
        //2.创建各级领导
        GroupLeader groupLeader=new GroupLeader();
        Manager manager=new Manager();
        GeneralManager generalManager=new GeneralManager();
        //3.创建处理请假条的责任链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        //由责任链头提交请假条并判断是否可以批准该请求
        groupLeader.submit(leaveRequest);
    }
}
