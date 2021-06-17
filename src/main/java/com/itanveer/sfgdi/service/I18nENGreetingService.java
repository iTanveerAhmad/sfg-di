package com.itanveer.sfgdi.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nENGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello World --- EN";
    }
}
