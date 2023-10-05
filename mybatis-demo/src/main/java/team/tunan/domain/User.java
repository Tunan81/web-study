package team.tunan.domain;

import lombok.Data;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/7
 */
@Data
public class User {
    private Integer userId;

    private String username;

    private String sex;

    private String hobbit;

    private String degree;

    private String note;

    private String role;

    private Integer status;

    private String password;

    private String avatar;

    private String email;

    private String phone;
}
