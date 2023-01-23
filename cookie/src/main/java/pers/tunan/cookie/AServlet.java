package pers.tunan.cookie;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author Tunan
 * @version 1.0
 */
@WebServlet("/aservlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //发送cookie

        //1.创建cookie对象
        //Cookie cookie = new Cookie("username","zs");
        String value = "张三";
        value = URLEncoder.encode(value, "UTF-8");
        Cookie cookie = new Cookie("username",value);

        //设置存活时间
        cookie.setMaxAge(60*60*24*7);

        //2.发送cookie，response
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
