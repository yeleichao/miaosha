package com.ylc.miaosha.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Description: TODO
 * @Date: 2019/4/24
 */
@Data
public class LoginVo {
    @NotNull(message = "手机号不能为空")
    @Size(min = 11,max = 11,message = "手机号位数必须是11位")
    private String mobile;
    @NotNull(message = "密码不能为空")
    private String password;


}
