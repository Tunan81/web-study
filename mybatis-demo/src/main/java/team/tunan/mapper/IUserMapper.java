package team.tunan.mapper;

import org.apache.ibatis.annotations.Select;
import team.tunan.domain.User;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/7
 */
public interface IUserMapper {
    List<User> findAll();
}
