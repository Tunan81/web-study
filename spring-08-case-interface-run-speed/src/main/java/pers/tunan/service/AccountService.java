package pers.tunan.service;

import pers.tunan.domain.Account;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 */
public interface AccountService {
    void save(Account account);
    void delete(Integer id);
    void update(Account account);
    List<Account> findAll();
    Account findById(Integer id);
}
