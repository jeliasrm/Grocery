package com.seck.model;

import javax.persistence.*;

/**
 * Created by elias on 19/06/17.
 */

@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    @Column(name = "id_supplier")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_supplier;

    @Column(name = "name_supplier")
    private String name;

    public Supplier() {
    }
}
