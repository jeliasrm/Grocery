package com.seck.repository;

import com.seck.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by elias on 19/06/17.
 */
public interface IProduct extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.id_product = :id_product")
    public Product getProductById_product(@Param("id_product") String id_product);

    @Query("select p from Product p where p.id_product = :id_product")
    public Product getProductBuy_price(@Param("buy_price") String buy_price);

    @Query("select p from Product p where p.id_product = :id_product")
    public Product getProductSell_price(@Param("sell_price") String sell_price);

}
