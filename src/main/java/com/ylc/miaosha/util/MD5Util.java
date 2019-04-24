package com.ylc.miaosha.util;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Description: 工具类
 * @Date: 2019/4/24
 */
public class MD5Util {

    private static final String salt = "1a2b3C";

    /**
     * MD5加密
     *
     * @param str
     * @return
     */
    public static String md5(String str) {
        return DigestUtils.md5Hex(str);
    }

    public static String inputPassFormPass(String inputPass) {
        return md5(inputPass + salt);
    }

    public static void main(String[] args) {
        System.out.println(inputPassFormPass("123456"));


    }
}










