package pers.tunan.config;

import org.springframework.context.annotation.*;

/**
 * @author Tunan
 * @version 1.0
 */
//Spring配置类:SpringConfig
@Configuration
@ComponentScan("pers.tunan")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
