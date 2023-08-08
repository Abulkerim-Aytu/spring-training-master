package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home (){
        return "home.html";
    }

    @RequestMapping("/aytu")
    public String aytu (){
        return "home.html";
    }

    @RequestMapping // nothing and /
    public String homeDefault (){
        return "home.html";
    }

    @RequestMapping({"/apple","banana"})
    public String home1 (){
        return "home.html";
    }
}
