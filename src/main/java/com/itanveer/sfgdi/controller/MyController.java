package com.itanveer.sfgdi.controller;

import com.itanveer.sfgdi.service.GreetingService;
import com.itanveer.sfgdi.service.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
