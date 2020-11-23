package com.superprince.service.impl;

import com.superprince.entity.vo.UserVo;
import com.superprince.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Boolean checkUsername(String username) {
        return null;
    }

    @Override
    public String checkPassword(String password) {
        return null;
    }

    @Override
    public Boolean checkEmail(String email) {
        return null;
    }

    @Override
    public void insertUser(UserVo userVo) {

    }
}
