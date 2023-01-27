package pers.tunan;

import pers.tunan.service.UserService;
import pers.tunan.service.impl.UserServiceimpl;

/**
 * @author Tunan
 * @version 1.0
 */
public class app {
    public static void main(String[] args) {
        UserService userService = new UserServiceimpl();
        userService.save();
    }
}
