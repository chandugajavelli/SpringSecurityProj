package com.example.SpringSecurityProj.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;



import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {


   
    @GetMapping("/hello")
    public String greet(HttpServletRequest request){


        return "hwwoo world  "+request.getSession().getId();
    }


    @GetMapping("/hi")
    public String hi(HttpServletRequest request){


        return "hiiiiiiiiiiii "+request.getSession().getId();
    }


}
