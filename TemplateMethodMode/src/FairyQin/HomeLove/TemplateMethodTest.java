package FairyQin.HomeLove;

import FairyQin.HomeLove.Template.AbstractClass;
import FairyQin.HomeLove.Template.TemplateImpl.ConcreteClass_BaoCai;
import FairyQin.HomeLove.Template.TemplateImpl.ConcreteClass_CaiXin;

/**
 * @author Black_ghost
 * @title: TemplateMethodTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-02-16 13:11:07
 * @Description 模板方法测试类
 **/
public class TemplateMethodTest {
    public static void main(String[] args){
        AbstractClass concrete_baocai=new ConcreteClass_BaoCai();
        AbstractClass concrete_caixin=new ConcreteClass_CaiXin();
        concrete_caixin.cookProcess();
        concrete_baocai.cookProcess();
    }
}
