package com.superprince.service.impl;

import com.superprince.commonutil.util.StringUtils;
import com.superprince.entity.po.UserPo;
import com.superprince.entity.vo.UserVo;
import com.superprince.service.RegistService;
import com.superprince.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistServiceImpl implements RegistService {

    @Autowired
    private UserService userService;
    @Override
    public String registUser(UserVo userVo) {
        UserPo userPo = new UserPo();
        userPo.setCreateTime(new Date());
        userPo.setUserName(userVo.getUserName());
        userPo.setEmail(userVo.getEmail());
        userPo.setPassword(StringUtils.strToMD5(userVo.getPassword()));

        userService.checkUsername(userVo.getUserName());

        return "false";
    }
}
