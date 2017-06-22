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
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToMany(mappedBy = "entity", cascade = CascadeType.ALL)
    private int id_product;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "buy_price")
    private Double buy_price;

    @Column(name = "sell_price")
    private Double sell_price;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "active")
    private Boolean active = true;

    public Product() {
    }

    public Product(String name, String brand, Double buy_price, Double sell_price, Integer qty, Boolean active) {
        this.name = name;
        this.brand = brand;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.qty = qty;
        this.active = active;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
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

    public Double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(Double buy_price) {
        this.buy_price = buy_price;
    }

    public Double getSell_price() {
        return sell_price;
    }

    public void setSell_price(Double sell_price) {
        this.sell_price = sell_price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
