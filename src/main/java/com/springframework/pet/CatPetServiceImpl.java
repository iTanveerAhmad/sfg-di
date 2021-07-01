package com.springframework.pet;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"CAT", "default"})
@Service("petService")
public class CatPetServiceImpl implements PetService{

    @Override
    public String theBestPet() {
        return "Cat";
    }
}
