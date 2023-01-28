package pers.tunan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import pers.tunan.dao.BookDao;
import pers.tunan.service.BookService;

/**
 * @author Tunan
 * @version 1.0
 */
@Repository
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Value("xia")
    private String name;
    /*  public BookServiceImpl(BookDao bookDao) {
            this.bookDao = bookDao;
        }*/
    public void save() {
        System.out.println("book service save ... " + name);
        bookDao.save();
    }
}
