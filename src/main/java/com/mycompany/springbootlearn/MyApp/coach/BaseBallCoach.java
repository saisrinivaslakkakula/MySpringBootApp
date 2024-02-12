package com.mycompany.springbootlearn.MyApp.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 30 Squats!";
    }
}
