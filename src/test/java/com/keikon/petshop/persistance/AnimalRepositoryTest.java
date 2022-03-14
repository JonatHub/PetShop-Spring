package com.keikon.petshop.persistance;

import com.keikon.petshop.persistance.crud.AnimalCrudRepository;
import com.keikon.petshop.persistance.entity.Animal;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class AnimalRepositoryTest {

    @Autowired
    AnimalCrudRepository productCrudRepository;

    @Test
    void shoud_return_a_product_list_from_repository(){
        List<Animal> products = (List<Animal>) productCrudRepository.findAll();
        int productsNum = products.size();
        System.out.println("Actually we own " + productsNum + " products.");
        assertTrue(productsNum > 0);
    }

    @Test
    void shoud_return_a_animal_by_id(){
        List<Animal> products = (List<Animal>) productCrudRepository.findIdAnimalUsingQueryMethods(1);
        System.out.println("Actually we own " + products.size() + " products.");
        for (Animal animal:products){
            System.out.println(animal.getName());

        }
    }


}