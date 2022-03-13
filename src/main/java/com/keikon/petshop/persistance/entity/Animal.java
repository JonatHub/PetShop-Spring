package com.keikon.petshop.persistance.entity;

import javax.persistence.*;
import java.util.List;

@Entity //Clase que mapea una tabla de una base de datos
@Table(name="animal") //It's only necesary if the name in Mysql is different
public class Animal {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Primary Key generate the autoincremental auto
    @Column(name = "id_animal")//It's only necesary if the name in Mysql is different
    private Integer idAnimal;

    private String name;

    private String status;

    @OneToOne
    @JoinColumn(name = "category_id_category", insertable = false, updatable = false)
    private Category idCategory;



    @OneToMany(mappedBy = "idAnimal")
    private List<DetailPurchase> detailPurchases;

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Category idCategory) {
        this.idCategory = idCategory;
    }


}
