package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/mentor/register
    public String register(Model model) {

        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String submitForm() {


        return "redirect:/mentor/register";
    }


}