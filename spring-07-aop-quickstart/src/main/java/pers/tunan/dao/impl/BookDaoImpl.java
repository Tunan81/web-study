package pers.tunan.dao.impl;

import org.springframework.stereotype.Repository;
import pers.tunan.dao.BookDao;

/**
 * @author Tunan
 * @version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save ...");
    }

    public void update(){
        System.out.println("book dao update ...");
    }

    @Override
    public void delete() {
        System.out.println("book dao delete ...");
    }
}
