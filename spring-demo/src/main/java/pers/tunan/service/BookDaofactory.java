package pers.tunan.service;

import pers.tunan.dao.BookDao;
import pers.tunan.dao.impl.BookDaoImpl;

/**
 * @author Tunan
 * @version 1.0
 */
public class BookDaofactory {
    public BookDao getUserDao(){
        return new BookDaoImpl();
    }
}
