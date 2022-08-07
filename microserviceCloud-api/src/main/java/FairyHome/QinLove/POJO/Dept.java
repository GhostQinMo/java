package FairyHome.QinLove.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Black_ghost
 * @title: Dept
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-06 16:39:41
 * @Description 一个部门的实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)  //开启链式编程，  不支持使用很多时候会发生无声的错 找不出
public class Dept  implements Serializable {  //实体类必须序列化

    private static final long serialVersionUID = -6849794470754669410L;  //必须手动实现序列化 后期避免不必要的的麻烦
    private Long deptid; //部门id
    private String deptname; //部门名称
    private String dbsource; //该表来自那个数据库
   /* public Dept(){

    }*/
    /*public Dept(Long deptid,String deptname,String dbsource){
        this.deptid=deptid;
        this.deptname=deptname;
        this.dbsource=dbsource;
    }*/
    public Dept(String deptname){
        super();
        this.deptname=deptname;
    }
}
