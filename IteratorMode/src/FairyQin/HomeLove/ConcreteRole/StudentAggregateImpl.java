package FairyQin.HomeLove.ConcreteRole;

import FairyQin.HomeLove.AbstractRole.StudentAggregate;
import FairyQin.HomeLove.AbstractRole.StudentIterator;

import java.util.List;

/**
 * @author Black_ghost
 * @title: StudentAggregateImpl
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-09-22 12:39:42
 * @Description 具体 聚合对象
 **/
public class StudentAggregateImpl  implements StudentAggregate {
    private List<Student> Stus;

    public List<Student> getStus() {
        return Stus;
    }

    public void setStus(List<Student> stus) {
        Stus = stus;
    }

    public StudentAggregateImpl(List<Student> stus) {
        this.Stus = stus;
    }

    public StudentAggregateImpl() {
    }

    @Override
    public void addStudent(Student student) {
            Stus.add(student);
    }

    @Override
    public void removeStudent(Student student) {
            Stus.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(Stus);
    }
}
