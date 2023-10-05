package pers.tunan.dao.impl;

import org.springframework.stereotype.Repository;
import pers.tunan.dao.BookDao;

/**
 * @author Tunan
 * @version 1.0
 */
@Repository("bookDao")
//@Component("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ..." );

    }
}
