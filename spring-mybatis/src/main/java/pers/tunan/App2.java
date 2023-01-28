package pers.tunan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.tunan.config.SpringConfig;
import pers.tunan.domain.Account;
import pers.tunan.service.AccountService;

/**
 * @author Tunan
 * @version 1.0
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account ac = accountService.findById(1);
        System.out.println(ac);
    }
}
