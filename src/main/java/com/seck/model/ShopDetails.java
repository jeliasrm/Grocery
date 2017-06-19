package com.seck.model;

import javax.persistence.*;

/**
 * Created by elias on 19/06/17.
 */
public class ShopDetails {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_shop")
    private int Id_shop;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product")
    private int Id_product;

    private int qty;

    public ShopDetails() {
    }

    public ShopDetails(int id_shop, int id_product, int qty) {
        Id_shop = id_shop;
        Id_product = id_product;
        this.qty = qty;
    }

    public int getId_shop() {
        return Id_shop;
    }

    public void setId_shop(int id_shop) {
        Id_shop = id_shop;
    }

    public int getId_product() {
        return Id_product;
    }

    public void setId_product(int id_product) {
        Id_product = id_product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
