package FairyQin.HomeLove.hungermode3;

/**
 * @author FairyQin
 */

public enum HungerUser {
    /*
        HUNGER_USER1 懒加载1号  😇😇  枚举实例必须放到最前面
    * */

    HUNGER_USER1("FairyQin1", 22),
    HUNGER_USER2("FairyQin1", 23),
    HUNGER_USER3("FairyQin3", 24);

    public String name;
    public Integer age;

    //私有的构造方法 private 修饰符可以省略
    HungerUser(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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

}
