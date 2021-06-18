package com.itanveer.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nESGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hola Mundo -- ES";
    }
}
