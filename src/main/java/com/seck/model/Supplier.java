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
    private int Id_supplier;

    @Column(name = "name_supplier")
    private String name;

    public Supplier() {
    }

    public Supplier(String name) {
        this.name = name;
    }

    public int getId_supplier() {
        return Id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        Id_supplier = id_supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
