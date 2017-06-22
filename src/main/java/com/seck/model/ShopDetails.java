package com.seck.model;

import javax.persistence.*;

/**
 * Created by elias on 19/06/17.
 */
public class ShopDetails {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_shop")
    private int id_shop;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product")
    private int id_product;

    private int qty;

    public ShopDetails() {
    }
}
