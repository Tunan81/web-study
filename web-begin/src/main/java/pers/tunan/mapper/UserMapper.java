package pers.tunan.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pers.tunan.pojo.User;


/**
 * @author Tunan
 * @version 1.0
 */
public interface UserMapper {

    /**
     * 用于用户登录
     * @param name
     * @param password
     * @return
     */
    @Select("SELECT * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String name, @Param("password") String password);

    /**
     * 根据用户名查询用户对象
     * @param username
     * @return
     */
    @Select("select * from tb_user where username = #{usernamem}")
    User selectByUsername(String username);

    /**
     * 添加新用户
     * @param user
     */
    @Insert("insert into tb_user values (null,#{username},#{password})")
    void add(User user);
}
