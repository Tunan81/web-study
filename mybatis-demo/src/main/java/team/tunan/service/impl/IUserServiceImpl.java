package team.tunan.service.impl;

import team.tunan.mapper.IUserMapper;
import team.tunan.service.IUserService;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/14
 */
public class IUserServiceImpl implements IUserService {

    private IUserMapper userMapper;

    @Override
    public void findAll() {
        userMapper.findAll();
    }
}
