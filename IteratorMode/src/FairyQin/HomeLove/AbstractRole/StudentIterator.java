package FairyQin.HomeLove.AbstractRole;

/**
 * @author Black_ghost
 * @title: StudentIterator
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-09-22 11:52:50
 * @Description 抽象迭代器角色
 **/
public interface StudentIterator<E> {
    /**
     * 是否有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    E next();
}
