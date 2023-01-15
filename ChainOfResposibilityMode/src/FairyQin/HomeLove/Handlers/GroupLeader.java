package FairyQin.HomeLove.Handlers;

import FairyQin.HomeLove.LeaveRequest;

/**
 * @author Black_ghost
 * @title: GroupLeader
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-01-07 23:29:37
 * @Description 小组长领导请假处理类
 **/
public class GroupLeader extends Handler{
    /**

     * @return null
     * @author Fairy_qin
     * @datetime 2023-50-15 10:50:58
     * @decription  规定小组长的可批准的假期区间为0-1天
     */
    public GroupLeader() {
        super(0,Handler.NUM_ONE );
    }

    @Override
    public void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+"天");
        System.out.println("请假的原因是"+leaveRequest.getContent());
        System.out.println("小组长批准通过");

    }
}
