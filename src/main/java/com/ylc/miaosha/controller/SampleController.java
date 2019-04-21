package com.ylc.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO
 * @Date: 2019/4/21
 */
@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("hello")
    public String thymeleaf(Model model){
        model.addAttribute("name", "yeleichao");
        return "hello";
    }
}



























