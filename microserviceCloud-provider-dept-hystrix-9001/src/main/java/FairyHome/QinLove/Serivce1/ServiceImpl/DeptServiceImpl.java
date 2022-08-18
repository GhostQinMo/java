package FairyHome.QinLove.Serivce1.ServiceImpl;

import FairyHome.QinLove.Mapper.DeptMapper;
import FairyHome.QinLove.POJO.Dept;
import FairyHome.QinLove.Serivce1.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Black_ghost
 * @title: DeptServiceImpl
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-06 19:54:13
 * @Description
 **/
@Service
public class DeptServiceImpl  implements DeptService {

    @Autowired
    DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        return deptMapper.selectAll();
    }

    @Override
    public Dept getOneByID(Long teptid) {
        return deptMapper.selectById(teptid);
    }

    @Override
    public boolean insertone(Dept dept) {
        return deptMapper.insert(dept);
    }
}
