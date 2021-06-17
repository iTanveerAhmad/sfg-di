package com.itanveer.sfgdi.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello World ------- PRIMARY Bean";
    }
}
