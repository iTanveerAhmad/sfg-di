package com.itanveer.sfgdi.service;


public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello world -- Property";
    }
}
