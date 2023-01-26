package pers.tunan.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.tunan.dao.UserDao;

/**
 * @author Tunan
 * @version 1.0
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        System.out.println("test");
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
