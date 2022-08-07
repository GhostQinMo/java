package FairyHome.QinLove.Controller;

import FairyHome.QinLove.POJO.Dept;
import FairyHome.QinLove.Serivce1.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Black_ghost
 * @title: DeptController
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-06 20:08:01
 * @Description
 **/
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;
    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.insertone(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept getOne(@PathVariable(value = "id") Long deptid){
        return deptService.getOneByID(deptid);
    }
    @GetMapping("/dept/getAll")
    public List<Dept> getAll(){
        return deptService.findAll();
    }
}
