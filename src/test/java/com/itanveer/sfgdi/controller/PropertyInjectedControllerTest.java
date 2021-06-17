package com.itanveer.sfgdi.controller;

import com.itanveer.sfgdi.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    // create PropertyInjectedController instance
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        // make object of PropertyInjectedController
        controller = new PropertyInjectedController();
        // now Interface that are used in controller is going to call its  implementation
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        // here is the test case
        System.out.println(controller.getGreeting());
    }
}