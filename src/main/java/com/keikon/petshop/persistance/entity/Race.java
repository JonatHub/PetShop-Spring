package com.keikon.petshop.persistance.entity;

import javax.persistence.*;

@Entity
@Table(name = "race")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRace;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id_category", insertable = false, updatable = false)
    private Category category;



    public Integer getIdRace() {
        return idRace;
    }

    public void setIdRace(Integer idRace) {
        this.idRace = idRace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
