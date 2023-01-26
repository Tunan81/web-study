package pers.tunan.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.tunan.service.impl.UserService;

/**
 * @author Tunan
 * @version 1.0
 */
public class UserController {
    public static void main(String[] args) {
/*        UserService userService = new UserService();
        userService.save();*/

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
