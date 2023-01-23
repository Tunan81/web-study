package pers.tunan.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Tunan
 * @version 1.0
 * 学习：Response响应字节&字符数据
 */
@WebServlet("/resp03")
public class ResponseDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //1.获取字符输出流
        PrintWriter writer = resp.getWriter();
        writer.write("你好");
        //resp.setHeader("content-type","text/html");
        writer.write("<h1>aaa</h1>");
        //细节:流不需要关闭

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
