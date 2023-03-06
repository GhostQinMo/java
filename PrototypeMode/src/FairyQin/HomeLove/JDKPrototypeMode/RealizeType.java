package FairyQin.HomeLove.JDKPrototypeMode;

import java.util.Arrays;

/**
 * @author Black_ghost
 * @title: RealizeType
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 19:47:02
 * @Description 原型类, 重写Object的克隆方法
 **/
public class RealizeType implements Cloneable{
    private    String name;
    private   String[]  hobby;
    private  User user;
    public RealizeType() {
        System.out.println("无参构造方法被调用");
    }

    public RealizeType(String name, String[] hobby, User user) {
        this.name = name;
        this.hobby = hobby;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RealizeType{" +
                "name='" + name + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", user=" + user +
                '}';
    }
}
