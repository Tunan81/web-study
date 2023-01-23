package pers.tunan.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * @author Tunan
 * @version 1.0
 */
@WebServlet("/bservlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie

        //1.获取cookie数组
        Cookie[] cookies = req.getCookies();

        //2.遍历数组
        for (Cookie cookie: cookies){
            String name = cookie.getName();
            if ("username".equals(name)){
                String value = cookie.getValue();

                //URL解码
                value = URLDecoder.decode(value,"UTF-8");

                System.out.println(name + ":" + value);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
