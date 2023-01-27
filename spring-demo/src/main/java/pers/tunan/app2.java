package pers.tunan;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.tunan.service.UserService;


/**
 * @author Tunan
 * @version 1.0
 */
public class app2 {
    public static void main(String[] args) {
        //3.获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        //UserDao userDao = (UserDao) ctx.getBean("userDao");
        //userDao.save();
        UserService userService = (UserService) ctx.getBean("service");
        userService.save();

    }
}

