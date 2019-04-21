package com.ylc.miaosha.controller;

import com.ylc.miaosha.result.Result;
import com.ylc.miaosha.service.UserService;
import com.ylc.miaosha.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: TODO
 * @Date: 2019/4/21
 */
@Controller
@RequestMapping("/demo")
public class SampleController {

    @Autowired
    private UserService userService;

    @RequestMapping("thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name", "yeleichao");
        return "hello";
    }

    @RequestMapping("hello")
    public Result<String> hello(){
        return Result.success("hello world");
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public Result<List<User>> getUsers(){
        List<User> users = userService.getUsers();
        return Result.success(users);
    }

    @RequestMapping("/insertUsers")
    @ResponseBody
    public Result<Boolean> insertUsers(){
        userService.insertUsers();
        return Result.success(true);
    }
}



























