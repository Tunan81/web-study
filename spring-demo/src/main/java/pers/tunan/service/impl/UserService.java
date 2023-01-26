package pers.tunan.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.tunan.dao.UserDao;
import pers.tunan.dao.impl.UserDaoimpl;

/**
 * @author Tunan
 * @version 1.0
 */
public class UserService implements pers.tunan.service.UserService {
    private UserDao userDao;
    public void setUserDao(){

    }
    @Override
    public void save() {
       /* ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");*/
        userDao.save();
    }

    public void setUserDao(UserDaoimpl userDao) {
        this.userDao = userDao;

    }
}
