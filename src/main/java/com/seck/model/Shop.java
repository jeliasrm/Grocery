package com.seck.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by elias on 19/06/17.
 */
public class Shop {

    @Id
    @Column(name = "id_shop")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "entity", cascade = CascadeType.ALL)
    private int id_shop;

    @OneToOne(fetch = FetchType.EAGER)
    private int id_seller;

    @OneToOne(fetch = FetchType.EAGER)
    private int id_supplier;

    @Column(name = "total_price")
    private int total_price;

    @Column(name = "payment")
    private String payment;

    @Column(name = "date")
    private Date date;

}
