package FairyQin.HomeLove;

/**
 * @author Black_ghost
 * @title: LeaveRequest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-01-07 22:47:45
 * @Description 请假条类
 **/
//这里的所有设计模式案例只是演示出该设计模式使用情景，便于理解，没有规范化
public class LeaveRequest {
    //请假人的名字
    private  String name;
    //请假的天数
    private int num;
    //请假的理由
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}


