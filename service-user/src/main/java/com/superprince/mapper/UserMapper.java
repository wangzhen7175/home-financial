package com.superprince.mapper;

import com.superprince.entity.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 插入一条用户信息
     * @param userPo
     */
    void insertOne(UserPo userPo);
}
