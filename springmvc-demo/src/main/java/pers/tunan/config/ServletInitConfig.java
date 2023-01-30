package pers.tunan.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author Tunan
 * @version 1.0
 * 4.定义一个servlet容器启动的配置类，在里面加载spring的配置
 */
public class ServletInitConfig extends AbstractDispatcherServletInitializer {
    //加载SpringMvc容器配置
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    //设置哪些请求归属SpringMvc处理
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    //加载Spring容器配置
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
