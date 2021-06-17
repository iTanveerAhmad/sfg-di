package com.itanveer.sfgdi.controller;

import com.itanveer.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    /**
     * This class is the example of
     * 'doing setter method injection'
     */

    // interface
    private GreetingService greetingService;

    // interface Setter method
    @Autowired
    public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        // return interface method
        return greetingService.sayGreetings();
    }
}
