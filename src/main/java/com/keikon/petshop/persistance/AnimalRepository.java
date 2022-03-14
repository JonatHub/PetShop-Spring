package com.keikon.petshop.persistance;

import com.keikon.petshop.persistance.crud.AnimalCrudRepository;
import com.keikon.petshop.persistance.entity.Animal;

import java.util.List;

public class AnimalRepository {

    private AnimalCrudRepository animalCrudRepository;

    public List<Animal> getAll(){
        return (List<Animal>) animalCrudRepository.findAll();
    }
}
