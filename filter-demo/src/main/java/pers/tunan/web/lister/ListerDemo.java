package pers.tunan.web.lister;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Tunan
 * @version 1.0
 */
@WebListener
public class ListerDemo implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //加载资源
        System.out.println("ContextLoaderListener...");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        //释放资源
    }
}
