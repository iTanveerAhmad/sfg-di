package com.itanveer.sfgdi.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DOG")
@Service("petService")
public class DogPetServiceImpl implements PetService{

    @Override
    public String theBestPet() {
        return "Dog";
    }
}
