package com.superprince.controller;


import com.alibaba.fastjson.JSONObject;
import com.superprince.commonutil.util.ResultUtils;
import com.superprince.entity.vo.UserVo;
import com.superprince.service.RegistService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户注册
 */
@RestController
@RequestMapping("/regist")
@Api(description = "新用户注册模块",tags = "新用户注册")
public class RegistController {
    @Autowired
    private RegistService registService;
    @PostMapping("")
    @ApiOperation(value = "注册用户" ,notes = "注册用户")
    public JSONObject regist(@RequestBody UserVo userVo) {
       return ResultUtils.resultJson(registService.registUser(userVo));
    }

}
