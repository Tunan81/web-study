package pers.tunan.web;

import pers.tunan.pojo.User;
import pers.tunan.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Tunan
 * @version 1.0
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //2.调用Service查询
        User user = service.login(username,password);
        //3.判断
        if (user != null){
            //将登录成功后的user对象，存储到session
            HttpSession session = req.getSession();
            session.setAttribute("user",user);

            //登录成功，跳转到查询所有的BrandServlet
            String contextpath = req.getContextPath();
            resp.sendRedirect(contextpath + "/selectAllServlet");
        }else {
            //登录失败
            //跳转到登录页面
            //存储错误信息到req中
            req.setAttribute("login_msg","用户名或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
