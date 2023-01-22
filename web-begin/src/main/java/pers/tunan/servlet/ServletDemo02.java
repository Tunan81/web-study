package pers.tunan.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author Tunan
 * @version 1.0
 * 学习：servlet生命周期
 */
@WebServlet(urlPatterns = "/demo02", loadOnStartup = 1)
public class ServletDemo02 implements Servlet {
    /**
     * 服务方法
     * 1.调用时机：默认情况下,servlet被第一次访问时调用
     * * loadOnStartup: 1服务器启动就调用
     * 2.调用次数：1次
     *
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init-demo02");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 初始化方法
     * 1.调用时机：每一次Servlet被访问就调用
     * 2.调用次数：多次
     *
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet-demo02");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 1.调用时机：内存释放或者服务器关闭的时候，Servlet对象会被销毁，调用
     * 2.调用次数 1次
     * 注意：只有tomcat被正常关闭时才会被调用
     */
    @Override
    public void destroy() {
        System.out.println("destroy-demo02");
    }
}
