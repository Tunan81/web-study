package pers.tunan.dao.impl;

import org.springframework.stereotype.Repository;
import pers.tunan.dao.BookDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Tunan
 * @version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ..." );
    }
    @PostConstruct //在构造方法之后执行，替换 init-method
    public void init() {
        System.out.println("init ...");
    }
    @PreDestroy //在销毁方法之前执行,替换 destroy-method
    public void destroy() {
        System.out.println("destroy ...");
    }
}
