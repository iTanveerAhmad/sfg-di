package com.itanveer.sfgdi.controller;

import com.itanveer.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /**
     * This class is the example of
     * 'doing manual Property injection'
     */

    @Qualifier("propertyInjectedGreetingService")
    // interface
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        // return interface method
        return greetingService.sayGreetings();
    }

}
