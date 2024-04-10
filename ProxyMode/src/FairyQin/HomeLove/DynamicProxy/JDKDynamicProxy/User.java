package FairyQin.HomeLove.DynamicProxy.JDKDynamicProxy;

/**
 * @Project Name : DesignModelAll
 * @Author ：AngelXin
 * @CreteTime：2024-04-10 19:49:25
 * @Description: @TODO
 * @Version：1.0
 */
public class User implements Person{
    private  String userInfo;
    @Override
    public String checkUserInfo(String password){
        //验证信息
        System.out.println("User中开始验证信息");
        return userInfo;
    }
    public User(String  userInfo){
        this.userInfo=userInfo;
    }
}
