package com.superprince.entity.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserVo {

    private String userName;//登录名
    private String password;//登录密码
    private String email;//邮箱
    // 修改密码表单
    private String newPass;//新密码
}
