package pers.tunan.service.impl;

import pers.tunan.dao.BookDao;
import pers.tunan.dao.UserDao;
import pers.tunan.service.BookService;

/**
 * @author Tunan
 * @version 1.0
 */
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;
    private final UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
