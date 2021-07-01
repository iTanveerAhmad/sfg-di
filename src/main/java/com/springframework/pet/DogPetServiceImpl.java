package com.springframework.pet;

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
