package pers.tunan.servlet;

import org.apache.ibatis.session.SqlSession;
import pers.tunan.mapper.UserMapper;
import pers.tunan.pojo.User;
import pers.tunan.util.MapperConfig;

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
 */
@WebServlet("/loginServlet02")
public class LoginServlet extends HttpServlet {
    private SqlSession session;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接收用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        session = MapperConfig.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.select(username,password);
        MapperConfig.closeSession(session);

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        if (user != null){
            //登录成功
            writer.write("登录成功");
        }else {
            //登录失败
            writer.write("登录失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
