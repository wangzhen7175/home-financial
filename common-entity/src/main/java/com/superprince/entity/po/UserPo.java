package com.superprince.entity.po;

import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

import java.util.Date;

@Data
@JsonComponent
public class UserPo {
    private String userId;//主键
    private String userName;//登录名
    private String password;//登录密码
    private String email;//邮箱
    private Integer status;//状态，1表示已激活 0未激活
    private String activationCode;//激活码，它是唯一值！即每个用户的激活码是不同的！
    private Date createTime;//注册时间
    private Date modifiedTime;//修改时间
    private Integer daleteFlag;//是否删除
}
