package com.itanveer.sfgdi.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello World -- Setter";
    }
}
