package FairyQin.HomeLove.Test;

import FairyQin.HomeLove.AbstractRole.StudentIterator;
import FairyQin.HomeLove.ConcreteRole.Student;
import FairyQin.HomeLove.ConcreteRole.StudentAggregateImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Black_ghost
 * @title: IteratorModeTest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-09-22 12:50:31
 * @Description 自定义迭代器模式测试
 **/
public class IteratorModeTest {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        List<Student> ls = new ArrayList<>();
        ls.add(new Student("angexin", 22));
        ls.add(new Student("qin", 21));
        ls.add(new Student("le", 23));
        studentAggregate.setStus(ls);
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()){
             Student next = (Student)studentIterator.next();
            System.out.println(next.toString());
        }
    }
}
