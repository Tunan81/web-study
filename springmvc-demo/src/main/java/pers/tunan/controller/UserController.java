package pers.tunan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tunan
 * @version 1.0
 */
//2.定义controller
    //2.1使用@controller定义bean
@Controller

public class UserController {
    //2.2设置当前操作的访问路径
    @RequestMapping("/save")
    //2.3设置当前操作的返回值类型
    @ResponseBody
    public String save(String name){
        System.out.println("user save...中文" + name);
        return "{'module':'springmvc'}";
    }
}
