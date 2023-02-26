package FairyQin.HomeLove.AbstractRole;

/**
 * @author Black_ghost
 * @title: Garnish
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-26 16:17:28
 * @Description 抽象装饰者角色
 **/
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }


}
