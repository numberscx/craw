package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloController {

    @Autowired
    Dog dog;
    @Autowired
    Environment envi;
    @GetMapping("/index")
    public String hello(){
        return "hello,world";
    }

    @RequestMapping("/ind")
    public String ind(){
        return "kuang";
    }

    @GetMapping("/dog")
    public String dog(){
        return dog.getA();
    }

}
