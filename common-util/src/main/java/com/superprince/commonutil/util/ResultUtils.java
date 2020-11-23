package com.superprince.commonutil.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class ResultUtils {
    /**
     * 接口调用成功，返回结果
     * @param str
     * @return
     */
    public static JSONObject resultJson(String str){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","success");
        jsonObject.put("result",str);
        return jsonObject;
    }
}
