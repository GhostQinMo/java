package FairyHome.QinLove.Consumer_Controller;

import FairyHome.QinLove.POJO.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Black_ghost
 * @title: RestController
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-06 21:50:28
 * @Description 用来暴露给客户端访问的控制器
 **/

//注意要使用 @RestController 返回json字符串
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    RestTemplate restTemplate;
    private final static String Rest_prefix="http://localhost:9090";

    @RequestMapping(value = "/consumer/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(Rest_prefix+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    //这里是rest风格需要使用@pathVariable表名产参数 否则会出现下面的错误
//    Optional long parameter 'id' is present but cannot be translated into a null value due to being declared as a primitive type.
//    Consider declaring it as object wrapper for the corresponding primitive type.
    public Dept seletone(@PathVariable(value = "id") long id){

        //这个git请求带有参数的话需要在请求路径后在加一个斜杠然后在加参数
        return restTemplate.getForObject(Rest_prefix+"/dept/get/"+id,Dept.class);

    }


    @RequestMapping(value = "/consumer/dept/getAll")
    public List<Dept> selectAll(){
        return restTemplate.getForObject(Rest_prefix+"/dept/getAll",List.class);
    }
}
