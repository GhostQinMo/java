package FairyQin.HomeLove.Handlers;

import FairyQin.HomeLove.LeaveRequest;

/**
 * @author Black_ghost
 * @title: GroupLeader
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-01-07 23:29:37
 * @Description 部门经理类请假处理类
 **/
public class Manager extends Handler{
    /**

     * @return null
     * @author Fairy_qin
     * @datetime 2023-50-15 10:50:58
     * @decription  规定部门经理类的可批准的假期区间为1-3天
     */
    public Manager() {
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }

    @Override
    public void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+"天");
        System.out.println("请假的原因是"+leaveRequest.getContent());
        System.out.println("部门经理批准通过");

    }
}
