package com.mycompany.springbootlearn.MyApp.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 40 push ups now!!";
    }
}
