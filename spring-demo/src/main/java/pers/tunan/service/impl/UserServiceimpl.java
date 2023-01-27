package pers.tunan.service.impl;

import pers.tunan.dao.UserDao;


/**
 * @author Tunan
 * @version 1.0
 */
public class UserServiceimpl implements pers.tunan.service.UserService {
    //5.删除业务层中new的方式创建的dao对象
    private UserDao userDao;

    //提供set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("user service save");
        userDao.save();
    }

}
