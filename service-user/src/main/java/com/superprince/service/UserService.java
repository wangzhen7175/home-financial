package com.superprince.service;

import com.superprince.entity.vo.UserVo;

public interface UserService {
    /**
     * 检查用户名是否重复
     * @param username
     * @return
     */
    Boolean checkUsername(String username);

    /**
     * 检查密码是否符合要求
     * @param password
     * @return
     */
    String checkPassword(String password);

    /**
     * 检查邮箱是否重复
     * @param email
     * @return
     */
    Boolean checkEmail(String email);

    /**
     * 插入一条用户
     * @param userVo
     */
    void insertUser(UserVo userVo);
}
