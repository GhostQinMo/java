package FairyQin.HomeLove.AbstractRole;

/**
 * @author Black_ghost
 * @title: FastFood
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-26 16:03:43
 * @Description 抽象构件（Component）角色
 **/
/**
 功能：以规范准备接收附加责任的具体构件
 * @author FairyQin
 * @param price 表示价格
 * @param desc 表示 菜品的描述
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    /**
     * fetch data by rule id
     *
     * @param ruleId rule id
     * @param page page number
     * @param jsonContext json format context
     * @return float
     */
    public abstract float cost();
}
