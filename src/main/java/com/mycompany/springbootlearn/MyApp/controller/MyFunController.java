package com.mycompany.springbootlearn.MyApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFunController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String greetUser() {
        return String.format("Hello %s ! your team %s is ready. Good Luck!", coachName, teamName);
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "Run Hard 5k!!";
    }
}
