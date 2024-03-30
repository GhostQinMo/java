package FairyQin.HomeLove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project Name : DesignModelAll
 * @Author ：AngelXin
 * @CreteTime：2024-03-30 17:39:13
 * @Description: @不可变类使用与设计思路解析
 * @Version：1.0
 */
@Slf4j
public class ImmutableDesign   {
    /**
     * 不可变类的使用
     * @description: Java提供的用来代替SimpleDateFormat的线程安全的日期时间格式化类
     * @author: AngelXin
     * @date: 2024/3/30 17:40
     * @param: []
     * @return: void
     **/
    @Test
    public void DateTimeFormatterTest(){
      DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",java.util.Locale.CHINA);
        LocalTime dateTime = dateTimeFormatter.parse("2024-03-30 17:42:00", LocalTime::from);
        log.info("date:{}",dateTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("localDateTime:{}",localDateTime);
        String format = dateTimeFormatter.format(localDateTime);
        log.info("format:{}",format);
    }
}
