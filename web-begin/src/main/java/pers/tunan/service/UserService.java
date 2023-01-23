package pers.tunan.service;

import org.apache.ibatis.session.SqlSession;
import pers.tunan.mapper.BrandMapper;
import pers.tunan.mapper.UserMapper;
import pers.tunan.pojo.Brand;
import pers.tunan.pojo.User;
import pers.tunan.util.MapperConfig;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 */
public class UserService {
    private SqlSession session;


    public UserService(){
        session = MapperConfig.getSession();
    }

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public User login(String username,String password){
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.select(username,password);
        MapperConfig.closeSession(session);
        return user;
    }
}
