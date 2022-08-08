package FairyHome.QinLove.Mapper;

import FairyHome.QinLove.POJO.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {


     boolean insert(Dept dept);

     List<Dept> selectAll();

     Dept selectById(long deptid);

}
