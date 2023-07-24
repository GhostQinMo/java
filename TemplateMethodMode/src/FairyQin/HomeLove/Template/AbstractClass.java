package FairyQin.HomeLove.Template;

/**
 * @author Black_ghost
 * @title: AbstractClass
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 12:54:22
 * @Description 模板方法中抽象类角色
 **/
public abstract class AbstractClass {
    //复习AQS的时候看到AQS中使用了模板方法设计模式
    //模板方法 可以定义为final修饰的，防止子类修改
    public  final void cookProcess(){
        pourOil();
        headOil();
        pourVagetable();
        pourSauce();
        fry();
    }
    //倒油
    public final void pourOil(){
        System.out.println("倒油…………");
    }
    //热油
    public  final void headOil(){
        System.out.println("热油………………");
    }

    //放入菜品，定义规范，有子类实现
    public  abstract void pourVagetable();

    //导入酱汁
    public abstract void pourSauce();
    //翻炒
    public final void fry(){
        System.out.println("翻炒。。。");
    }
}
