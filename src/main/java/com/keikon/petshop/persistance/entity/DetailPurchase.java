package com.keikon.petshop.persistance.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detailpurchase")
public class DetailPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_purchase")
    private Integer idDetailPurchase;

    @ManyToOne
    @JoinColumn(name = "animal_id_animal", insertable = false, updatable = false)
    private Animal idAnimal;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "purchase_id_purchase", insertable = false, updatable = false)
    private Purchase idPurchase;

    private BigDecimal total;

    public Integer getIdDetailPurchase() {
        return idDetailPurchase;
    }

    public void setIdDetailPurchase(Integer idDetailPurchase) {
        this.idDetailPurchase = idDetailPurchase;
    }

    public Animal getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Animal idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Purchase getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(Purchase idPurchase) {
        this.idPurchase = idPurchase;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
