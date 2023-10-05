package pers.tunan.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Tunan
 * @version 1.0
 * 登录验证的过滤器
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;

        //判断访问的资源路径是否和登录注册相关
        String[] urls = {"/login.jsp", "/imgs/", "/css/", "LoginServlet", "/register.jsp", "registerServlet"};
        //获取当前访问资源的路径
        String url = req.getRequestURL().toString();

        //循环遍历
        for (String u : urls) {
            if (url.contains(u)) {
                //放行
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        }

        //1.判断session中是否有user
        HttpSession session = req.getSession();
        Object u = session.getAttribute("user");

        //2.判断user
        if (u != null) {
            //登录过了
            //放行
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            req.setAttribute("login_msg", "您尚为登录！");
            req.getRequestDispatcher("/login.jsp").forward(servletRequest, servletResponse);
        }
    }

    public void destroy() {

    }
}
