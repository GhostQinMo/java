package FairyQin.HomLove.POJO;

/**
 * @author Black_ghost
 * @title: Coffee
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-06 09:03:40
 * @Description 抽象产品
 **/
public interface Coffee {
    public String getName();
    //加牛奶
    default void  addMilk(){
        System.out.println("添加牛奶");
    }
    default  void addSuge(){
        System.out.println("添加糖");
    }

}
