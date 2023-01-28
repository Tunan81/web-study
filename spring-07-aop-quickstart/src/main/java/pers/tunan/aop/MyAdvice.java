package pers.tunan.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Tunan
 * @version 1.0
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void pers.tunan.dao.BookDao.update())")
    private void pt(){}

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

}
