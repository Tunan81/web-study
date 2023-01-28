package pers.tunan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.tunan.config.SpringConfig;
import pers.tunan.dao.BookDao;
import pers.tunan.service.BookService;

/**
 * @author Tunan
 * @version 1.0
 */
public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
