package FairyHome.QinLove.Service;

import FairyHome.QinLove.POJO.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Black_ghost
 * @title: DeptClientServiceFallbackFactory
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-17 21:44:05
 * @Description dept的服务降级的接口, 降低fallbackmethod方法与真实的业务逻辑方法分离(降低耦合度), 防止代码膨胀
 **/
@Component        //只有放到容器中的组件才会生效
//需要实现fallbackFactory接口来表示这是一个服务降级处理的接口
public class DeptClientServiceFallbackFactory implements FallbackFactory<setFeign> {


    @Override
    public setFeign create(Throwable throwable) {
        return new setFeign() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept getOne(Long deptid) {
                return new Dept("id为"+deptid+"的部门不存在!!!\n请检查id是否正确");
            }

            @Override
            public List<Dept> getAll() {
                return Arrays.asList(new Dept("查询所有的部门信息出现错错误"));
            }
        };
    }
}
