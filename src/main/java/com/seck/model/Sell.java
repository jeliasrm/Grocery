package com.seck.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by elias on 19/06/17.
 */

@Entity
@Table(name = "sell")
public class Sell {

    @Id
    @Column(name = "id_sell")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_sell;

    @Column(name = "price")
    private double price;

    @Column(name = "date")
    private Date date;

    public Sell() {
    }

    public Sell(double price, Date date) {
        this.price = price;
        this.date = date;
    }

    public int getId_sell() {
        return Id_sell;
    }

    public void setId_sell(int id_sell) {
        Id_sell = id_sell;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
