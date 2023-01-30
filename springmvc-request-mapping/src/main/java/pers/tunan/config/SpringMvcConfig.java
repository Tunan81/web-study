package pers.tunan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Tunan
 * @version 1.0
 */

@Configuration
@ComponentScan("pers.tunan.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
