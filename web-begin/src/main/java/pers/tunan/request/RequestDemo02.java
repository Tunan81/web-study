package pers.tunan.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Tunan
 * @version 1.0
 * 学习：通用方式获取统一参数
 */
@WebServlet("/req02")
public class RequestDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //GET请求逻辑

        //1.获取所有参数的Map集合
        Map<String,String[]> map = req.getParameterMap();
        for (String key: map.keySet()){
            System.out.print(key + ":");

            //获取值
            String[] values = map.get(key);
            for (String value: values){
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");

        //2.根据key获取参数值,数组
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies){
            System.out.println(hobby);
        }

        //3.根据key获取单个数据
        String username = req.getParameter("username");
        System.out.println(username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //POST请求逻辑
        this.doGet(req,resp);
    }
}
