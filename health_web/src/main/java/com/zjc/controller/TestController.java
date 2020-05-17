package com.zjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * 访问/test/hello  跳转到main页面
     */
    @RequestMapping("/hello")
    public String hello(){
        return "main";
    }
}
