package fairyhome.qinlove;

/**
 * @Project Name : Spring5WorkSpace
 * @Author ：AngelXin
 * @CreteTime：2022-04-17 04:13:24
 * @Description: POJO bean
 * @Version：1.0
 */
public class User {
    /**
     * Name字段用于存储用户的姓名信息
     */
    private String name;

    /**
     * Age字段用于存储用户的年龄信息
     */
    private int age;

    /**
     * Gender字段用于存储用户的性别信息
     */
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User() {
    }


    public void init() {
        System.out.println("User init");
    }
}
