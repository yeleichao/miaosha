package com.ylc.miaosha.result;

import lombok.Data;

/**
 * @Description: 返回通用代码错误类
 * @Date: 2019/4/21
 */
@Data
public class CodeMsg {

    private int code;
    private String msg;

    //通用异常
    public static CodeMsg SUCCESS = new CodeMsg(000000,"success");
    public static CodeMsg ERROR = new CodeMsg(999999,"服务端异常");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
