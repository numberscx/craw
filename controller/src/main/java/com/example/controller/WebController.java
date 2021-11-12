package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// returns objects always
@RestController
public class WebController {

    @GetMapping("/index")
    public String hello(){
        return "index";
    }

    @GetMapping("/index")
    public String addShare(List<String> shareList){
        return "index";
    }




}
