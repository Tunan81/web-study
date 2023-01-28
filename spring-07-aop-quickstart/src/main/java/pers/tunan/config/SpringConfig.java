package pers.tunan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Tunan
 * @version 1.0
 */
@Configuration
@ComponentScan("pers.tunan")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
