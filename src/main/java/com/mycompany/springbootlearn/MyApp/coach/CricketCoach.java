package com.mycompany.springbootlearn.MyApp.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice speed bowling for 30 minutes.";
    }
}
