package FairyHome.QinLove.Serivce1;

import FairyHome.QinLove.POJO.Dept;

import java.util.List;


public interface DeptService {
    List<Dept> findAll();
     Dept getOneByID(Long teptid);
     boolean insertone(Dept dept);
}
