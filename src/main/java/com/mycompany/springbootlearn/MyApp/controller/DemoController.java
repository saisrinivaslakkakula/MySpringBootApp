package com.mycompany.springbootlearn.MyApp.controller;

import com.mycompany.springbootlearn.MyApp.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Here is where the dependency injection takes place
// we create a private member of type Coach which shall be used to assign with the object that was injected as dependency
// In this case, we have Coach class, and it's implementation CricketCoach
// Cricket Coach is a Component hence  the object for CricketCoach will be created automatically for us by Springboot
// This DemoController needs a coach object hence spring injects the created CricketCoach object as a dependency
// We shall see what if multiple implementations of same Coach class annotated with @Component and
// how spring injects them in the later parts


@RestController
public class DemoController {

    private Coach coach;

    // since we have only one implementation as of now for Coach class called CricketCoach
    // Spring already would have crated object for it as CricketCoach is annotated with @Component,
    // The created object is injected as dependency through a constructor here
    // that injected dependency is asigned to the private variable and used by business logic to perform required business logic.
   /* @Autowired
    public void DemoController( Coach coach){
        this.coach = coach;
    }*/


    // here intead of constructor we are using a setter method or as a matter of fact any method name
    // to set the private Coach attribute with the passed parameter to the setter method.
    // This is precisely called as setter injection.
    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    //In this case, the business logic is call getDailyWorkout method and return it's result
    @GetMapping("/getdailyworkout")
    public String getDailyworkout() {
        return coach.getDailyWorkout();
    }
}
