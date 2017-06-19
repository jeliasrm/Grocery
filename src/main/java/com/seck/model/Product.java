package com.seck.model;

import javax.persistence.*;

/**
 * Created by elias on 19/06/17.
 */

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_product;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "buy_price")
    private double buy_price;

    @Column(name = "sell_price")
    private double sell_price;

    @Column(name = "qty")
    private int qty;

    public Product() {
    }

    public Product(int id_product, String name, String brand, double buy_price, double sell_price) {
        Id_product = id_product;
        this.name = name;
        this.brand = brand;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
    }

    public int getId_product() {
        return Id_product;
    }

    public void setId_product(int id_product) {
        Id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public double getSell_price() {
        return sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }
}
