package FairyQin.HomeLove.DeepClone;

import FairyQin.HomeLove.JDKPrototypeMode.User;

import java.io.Serializable;

/**
 * @author Black_ghost
 * @title: PrototypeClass
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 20:38:53
 * @Description 原型类
 **/
// 因为需要使用对象流 所以需要实现序列化机制

public class PrototypeClass  implements Serializable {
    private final static long PROTOTYPE_CLASS_SERIALIZABLEUID =-3424457234L;
    private User user;

    @Override
    public String toString() {
        return "PrototypeClass{" +
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PrototypeClass(User user) {
        this.user = user;
    }
}
