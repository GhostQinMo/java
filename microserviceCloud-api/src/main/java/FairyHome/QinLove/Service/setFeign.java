package FairyHome.QinLove.Service;

import FairyHome.QinLove.POJO.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author Black_ghost
 * @title: setFeign
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-08 21:36:31
 * @Description 使用Feign简化服务访问
 **/
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")   //这是使用feign负载均衡 通过接口+注解访问
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface setFeign {
    @PostMapping("/dept/add")
    boolean addDept(@RequestBody Dept dept);
    @GetMapping("/dept/get/{id}")
    Dept getOne(@PathVariable(value = "id") Long deptid);
    @GetMapping("/dept/getAll")
    List<Dept> getAll();

}
