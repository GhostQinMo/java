package FairyQin.HomeLove.Template.TemplateImpl;

import FairyQin.HomeLove.Template.AbstractClass;

/**
 * @author Black_ghost
 * @title: ConcreteClass_BaoCai
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 13:05:42
 * @Description 模板方法中的具体子类角色之一
 **/
public class ConcreteClass_BaoCai extends AbstractClass {
    @Override
    public void pourVagetable() {
        System.out.println("放入包菜！！！！");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入辣椒酱！！！！");
    }
}
