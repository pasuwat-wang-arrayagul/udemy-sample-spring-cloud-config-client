package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController {

    @Value("${hello.txt}")
    private String helloTxt;

    @GetMapping("/hello")
    public @ResponseBody String getHello(){
        return helloTxt;
    }
}
