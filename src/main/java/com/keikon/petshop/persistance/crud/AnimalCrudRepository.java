package com.keikon.petshop.persistance.crud;

import com.keikon.petshop.persistance.entity.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Operations in the database with SpringData, in this case CrudRepository
public interface AnimalCrudRepository extends CrudRepository<Animal,Integer> {

    //With Query, its not necesary used the name convention

    //With Querymethods
    List<Animal> findByIdAnimal(int idAnimal);

    @Query(value = "SELECT * FROM animal WHERE id_animal = ?" ,nativeQuery = true)
    List<Animal> findIdAnimalUsingQueryMethods(int idAnimal);


}
