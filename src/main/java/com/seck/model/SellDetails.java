package com.seck.model;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by elias on 19/06/17.
 */
public class SellDetails {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_sell")
    private int Id_sell;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product")
    private int Id_product;

    private int qty;

    public SellDetails() {
    }

    public SellDetails(int id_sell, int id_product, int qty) {
        Id_sell = id_sell;
        Id_product = id_product;
        this.qty = qty;
    }

    public int getId_sell() {
        return Id_sell;
    }

    public void setId_sell(int id_sell) {
        Id_sell = id_sell;
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
