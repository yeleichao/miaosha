package com.ylc.miaosha.controller;

import com.ylc.miaosha.result.CodeMsg;
import com.ylc.miaosha.result.Result;
import com.ylc.miaosha.service.UserService;
import com.ylc.miaosha.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO
 * @Date: 2019/4/24
 */
@Controller
@RequestMapping("login")
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/to_login")
    public String to_login(){
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<Boolean> do_login(LoginVo vo){
        log.info(vo.toString());
        boolean b = userService.getUserByMobile(vo);
        return Result.success(b);
    }
}
