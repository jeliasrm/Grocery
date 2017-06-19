package com.seck.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by elias on 19/06/17.
 */
public class Shop {

    @Id
    @Column(name = "id_shop")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_shop;

    private int Id_seller;

    private int Id_supplier;

    @Column(name = "total_price")
    private int total_price;

    @Column(name = "payment")
    private String payment;

    @Column(name = "date")
    private Date date;

}
