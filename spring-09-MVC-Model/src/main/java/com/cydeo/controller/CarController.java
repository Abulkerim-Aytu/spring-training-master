package com.cydeo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class CarController {
    public String carInfo(){
        return "/car/car";
    }

}
