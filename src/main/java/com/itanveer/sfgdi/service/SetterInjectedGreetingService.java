package com.itanveer.sfgdi.service;


public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello World -- Setter";
    }
}
