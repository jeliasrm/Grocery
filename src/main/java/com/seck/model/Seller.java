package com.seck.model;

import javax.persistence.*;

/**
 * Created by elias on 19/06/17.
 */

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @Column(name = "id_seller")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "entity", cascade = CascadeType.ALL)
    private int Id_seller;

    @Column(name = "name_seller")
    private String name;

    public Seller() {
    }

    public Seller(String name_seller) {
        this.name = name_seller;
    }

    public int getId_seller() {
        return Id_seller;
    }

    public void setId_seller(int id_seller) {
        Id_seller = id_seller;
    }

    public String getName_seller() {
        return name;
    }

    public void setName_seller(String name_seller) {
        this.name = name_seller;
    }
}
