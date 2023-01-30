package pers.tunan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 */
@Controller
public class BookController {
    @RequestMapping("/book/save")
    @ResponseBody
    public String save(String name){
        System.out.println("普通参数传递：" + name);
        System.out.println("book save ...");
        return "{'module':'book save'}";
    }

    @RequestMapping("/book/listforjson")
    @ResponseBody
    public String ListparamForJson(@RequestBody List<String> likes){
        System.out.println("list commin(json)参数传递 ==> " + likes);
        return "{'module':'list common for json param'}";
    }
}
