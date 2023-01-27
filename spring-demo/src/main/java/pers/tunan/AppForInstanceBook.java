package pers.tunan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.tunan.dao.BookDao;
import pers.tunan.service.BookDaofactory;

/**
 * @author Tunan
 * @version 1.0
 */
public class AppForInstanceBook {
    public static void main(String[] args) {
        //创建实例工厂对象
        //BookDaofactory bookDaofactory = new BookDaofactory();
        //通过实例工厂对象创建对象
        //BookDao bookDao = bookDaofactory.getUserDao();
        //bookDao.save();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);
    }
}
