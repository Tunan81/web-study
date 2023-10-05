package pers.tunan.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tunan
 * @version 1.0
 * 学习：urlpattern配置
 */

@WebServlet(urlPatterns = {"/demo06","/demo07"})
public class ServletDemo06 extends HttpServlet {
    /**
     * 1.一个Servlet，可以配置多个urlpattern
     * 2.url配置规则
     *  精确匹配：@webServlet("/user/select)
     *  目录匹配：@webServlet("/user/*")
     *  扩展名匹配：@webServlet("*.do") 注意这里没有 /
     *  任意匹配：@webServlet("/")或者@webServlet("/*") /*的优先级高于/
     *  一般使用任意匹配
     *  优先级: 精确 > 目录 > 扩展名 > /* > /
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet-get-06/07");
    }
}
