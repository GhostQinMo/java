package FairyHome.QinLove.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Black_ghost
 * @title: ExceptionMessage
 * @projectName microserviceCloud
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2022-08-17 17:40:38
 * @Description 用来封装异常信息
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExceptionMessage {
    private  String errorData;   //错误数据
    private String errorDate;           //产生错误的时间
    private String Remark ;         //用于备注其他的信息
}
