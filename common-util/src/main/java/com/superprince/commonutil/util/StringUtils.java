package com.superprince.commonutil.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringUtils {

    /**
     * 字符串拼接
     * @param args
     * @return
     */
    public static String joinString(String ... args){
        StringBuffer stringBuffer = new StringBuffer();
        for(String arg : args){
            stringBuffer.append(arg);
        }
        return stringBuffer.toString();
    }

    /**
     * 对字符串进行md5摘要
     * @param str
     * @return
     */
    public static String strToMD5(String str){
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    str.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
}
