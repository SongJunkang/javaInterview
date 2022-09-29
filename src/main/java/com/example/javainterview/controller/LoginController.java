package com.example.javainterview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author joakims
 * @create 2022-09-29-0:24
 **/

@Controller
public class LoginController {


    @GetMapping("/login")
    public String toLogin(){

        return "login";
    }
}
