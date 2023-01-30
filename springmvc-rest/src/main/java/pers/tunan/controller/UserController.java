package pers.tunan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.tunan.domain.User;

/**
 * @author Tunan
 * @version 1.0
 */
@Controller
public class UserController {
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(/*@RequestBody User user*/) {
        System.out.println("user save..."/*+user*/);
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById..." + id);
        return "{'module':'user getById'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }
}
