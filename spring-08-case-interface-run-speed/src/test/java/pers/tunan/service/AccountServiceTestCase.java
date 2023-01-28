package pers.tunan.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.tunan.config.SpringConfig;
import pers.tunan.domain.Account;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        Account ac = accountService.findById(1);
        System.out.println(ac);
    }

    @Test
    public void testFindAll(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
