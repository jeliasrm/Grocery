package com.seck.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by elias on 19/06/17.
 */

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @Column(name = "id_seller")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_seller;

    @Column(name = "name_seller")
    private String name;

    @OneToMany(mappedBy = "id_seller", cascade = CascadeType.ALL)
    private Set<Sell> sells;

    public Seller() {
    }

    public Seller(String name_seller) {
        this.name = name_seller;
    }

    public int getId_seller() {
        return id_seller;
    }

    public void setId_seller(int id_seller) {
        this.id_seller = id_seller;
    }

    public String getName_seller() {
        return name;
    }

    public void setName_seller(String name_seller) {
        this.name = name_seller;
    }
}
