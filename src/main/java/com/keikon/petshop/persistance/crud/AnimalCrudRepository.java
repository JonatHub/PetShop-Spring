package com.keikon.petshop.persistance.crud;

import com.keikon.petshop.persistance.entity.Animal;
import org.springframework.data.repository.CrudRepository;

//Operations in the database with SpringData, in this case CrudRepository
public interface AnimalCrudRepository extends CrudRepository<Animal,Integer> {


}
