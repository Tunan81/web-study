package pers.tunan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.tunan.config.SpringConfig;
import pers.tunan.dao.BookDao;
import pers.tunan.service.BookService;

/**
 * @author Tunan
 * @version 1.0
 */
public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = ctx.getBean(BookDao.class);
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        System.out.println(bookDao1);
        System.out.println(bookDao2);
        System.out.println("=====================");
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
        ctx.close(); //关闭容器
    }
}
