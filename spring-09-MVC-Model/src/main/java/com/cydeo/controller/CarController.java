package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

//  localhost:54739/info?k=Honda
    @RequestMapping("/info")
    public String carInfo(@RequestParam String k, Model model){

            model.addAttribute("k",k);
        return "/car/car";
    }

    //localhost:54739/info2 (KIA)
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "k", required = false, defaultValue = "KIA") String car, Model model){

        model.addAttribute("k",car);
        return "/car/car";
    }

    //localhost:54739/info3?k=Honda&k1=2015
    @RequestMapping("/info3")
    public String carInfo3(@RequestParam String k,@RequestParam int k1 ,Model model){

        model.addAttribute("k",k);
        model.addAttribute("k1",k1);

        return "/car/car";
    }


    @RequestMapping("/info/{car}/{age}") //localhost:8080/info/honda
    public String getCarInfo (@PathVariable String car,@PathVariable int age) {
        System.out.println(car);
        System.out.println(age);

        return "car/car";
    }
}
