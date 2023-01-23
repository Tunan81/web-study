package pers.tunan.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tunan
 * @version 1.0
 * 学习：Response 完成重定向
 */
@WebServlet("/resp01")
public class ResponseDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resp01");

        //重定向
        //1.设置响应状态码
        //resp.setStatus(302);
        //2.设置响应头Location
        //resp.setHeader("Location","/web-begin/resp02");

        //简化方式完成重定向
        //动态获取虚拟目录
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/resp02");
        //resp.sendRedirect("/web-begin/resp02");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
