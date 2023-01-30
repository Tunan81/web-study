package pers.tunan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tunan
 * @version 1.0
 */
//3.创建Spring的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("pers.tunan.controller")
public class SpringMvcConfig {
}
