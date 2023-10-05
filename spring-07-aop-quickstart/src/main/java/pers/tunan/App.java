package pers.tunan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.tunan.config.SpringConfig;
import pers.tunan.dao.BookDao;

/**
 * @author Tunan
 * @version 1.0
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
