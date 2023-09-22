package FairyQin.HomeLove.ConcreteRole;

import FairyQin.HomeLove.AbstractRole.StudentIterator;

import java.util.List;
import java.util.Objects;

/**
 * @author Black_ghost
 * @title: StudentIteratorImpl
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-09-22 12:02:07
 * @Description 具体迭代器
 **/
public class StudentIteratorImpl<T> implements StudentIterator<T>{
    private List<T> container;
    private int index_flag=0;
    public StudentIteratorImpl(List<T> container) {
        this.container = container;
    }

    public StudentIteratorImpl(){}

    @Override
    public boolean hasNext() {
        if (Objects.isNull(container)){
            throw new NullPointerException("container is null");
        }
        return container.size()>index_flag;
    }

    @Override
    public T next() {
       return container.get(index_flag++);
    }
}
