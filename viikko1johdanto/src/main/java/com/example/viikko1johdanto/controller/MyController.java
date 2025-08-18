package com.example.viikko1johdanto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
    @RequestMapping("/hello")
    @ResponseBody
    
    public String returnString(@RequestParam String name, @RequestParam String location) {
        return "Welcome to the " + location +" "+ name + "!";
    }
    

}
