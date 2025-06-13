package com.shashank.mvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdditionController {

    @RequestMapping("/add")
    public String add(){
        return "addition";
    }
}
