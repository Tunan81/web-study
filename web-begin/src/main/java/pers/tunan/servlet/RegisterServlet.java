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

/**
 * @author Tunan
 * @version 1.0
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private SqlSession session;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接收用户数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //封装用户对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        session = MapperConfig.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u = mapper.selectByUsername(username);

        if (u == null){
            mapper.add(user);
            MapperConfig.closeSession(session);
        }else {
            //用户不存在，给出提示
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("用户名已存在");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
