package pers.tunan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.tunan.dao.BookDao;

/**
 * @author Tunan
 * @version 1.0
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        //要执行close方法的第一种方法-暴力方式
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //bookDao.save();
        //ctx.close();

        //第二种关闭容器的方法
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
