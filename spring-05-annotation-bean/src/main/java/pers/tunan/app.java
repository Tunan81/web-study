package pers.tunan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.tunan.dao.BookDao;
import pers.tunan.service.BookService;

/**
 * @author Tunan
 * @version 1.0
 */
public class app {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
