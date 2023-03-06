package FairyQin.HomeLove.JDKPrototypeMode;

import java.io.Serializable;

/**
 * @author Black_ghost
 * @title: User
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 20:09:18
 * @Description
 **/
// 因为需要使用对象流 所以需要实现序列化机制

public class User implements Serializable {
    private final static long USER_SERIALIZABLEUID =-324312734L;

    private  String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
