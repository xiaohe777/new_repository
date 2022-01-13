package com.yjxxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping("hello")
    public String hello1(Model model){

        model.addAttribute("msg","hello mvc");

        return "hello";
    }
}
