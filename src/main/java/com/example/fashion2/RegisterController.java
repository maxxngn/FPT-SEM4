package com.example.fashion2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class RegisterController {
    @GetMapping("register")
    public String hello() {
        return "register";
    }

}
