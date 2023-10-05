package team.tunan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import team.tunan.service.IUserService;

import javax.annotation.Resource;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/14
 */
@Controller("userController")
public class UserController {

    @Resource
    private IUserService userService;

    /**
     * 查询所有用户
     */
    @GetMapping("/findAll")
    public void findAll() {
        userService.findAll();
    }
}
