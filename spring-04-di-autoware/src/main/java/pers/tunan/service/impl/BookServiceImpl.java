package pers.tunan.service.impl;

import pers.tunan.dao.BookDao;
import pers.tunan.service.BookService;

/**
 * @author Tunan
 * @version 1.0
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
