package com.mycompany.springbootlearn.MyApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFunController {

    @GetMapping("/")
    public String greetUser() {
        return "Hello!";
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "Run Hard 5k!!";
    }
}
