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
    private int id_sell;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product")
    private int id_product;

    private int qty;

    public SellDetails() {
    }

}
