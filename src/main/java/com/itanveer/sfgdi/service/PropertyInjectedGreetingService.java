package com.itanveer.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello world -- Property";
    }
}
