package pers.tunan.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Tunan
 * @version 1.0
 * 学习 Request 获取请求参数
 */
@WebServlet("/req01")
public class RequestDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求方式
        String method = req.getMethod();
        System.out.println("请求方式：" + method);

        //2.获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println("虚拟目录："+contextPath);

        //3.获取URL
        StringBuffer url = req.getRequestURL();
        System.out.println("URL:"+url.toString());

        //4.获取URI
        String uri = req.getRequestURI();
        System.out.println("URi:"+uri);

        //5.获取请求参数
        String queryString = req.getQueryString();
        System.out.println("请求参数:" + queryString);

        //-----------------------------
        //6.获取请求头信息
        String header = req.getHeader("user-agent");
        System.out.println("请求头" + header);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取post 请求体

        //1.获取字符输入流
        BufferedReader br = req.getReader();
        //2.读取数据
        String line = br.readLine();
        System.out.println(line);
    }

}
