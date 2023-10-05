package pers.tunan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.tunan.config.SpringConfig;
import pers.tunan.service.AccountService;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/13
 */

@RunWith(SpringJUnit4ClassRunner.class) //设置类运行器
@ContextConfiguration(classes = {SpringConfig.class})
public class ccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void test(){
        System.out.println(accountService.findById(1));
    }
}
