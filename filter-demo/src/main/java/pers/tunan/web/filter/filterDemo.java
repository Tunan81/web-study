package pers.tunan.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Tunan
 * @version 1.0
 */
@WebFilter("/*")
public class filterDemo implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("1.FilterDemo");

        //放行前逻辑


        //放行
        filterChain.doFilter(servletRequest,servletResponse);


        //放行后逻辑，对response处理

    }

    public void destroy() {

    }
}
