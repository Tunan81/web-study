package pers.tunan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tunan.dao.AccountDao;
import pers.tunan.domain.Account;
import pers.tunan.service.AccountService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
