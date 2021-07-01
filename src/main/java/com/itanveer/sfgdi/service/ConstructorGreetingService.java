package com.itanveer.sfgdi.service;


public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello world -- constructor";
    }
}
