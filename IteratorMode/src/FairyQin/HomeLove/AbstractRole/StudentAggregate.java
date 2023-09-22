package FairyQin.HomeLove.AbstractRole;

import FairyQin.HomeLove.ConcreteRole.Student;

/**
 * @author Black_ghost
 * @title: StudentAggregate
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-09-22 11:58:26
 * @Description 抽象聚合角色
 **/
public interface  StudentAggregate {
    /**
     * 添加指定元素
     * @param student
     */
    void addStudent(Student student);

    /**
     * 移除指定元素
     * @param student
     */
    void removeStudent(Student student);

    /**
     *  获取迭代器
     * @return
     */
    StudentIterator getStudentIterator();
}
