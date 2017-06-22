package com.seck.repository;

import com.seck.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by elias on 19/06/17.
 */
public interface ISellerRepository extends JpaRepository<Seller, Long> {

    @Query("select s from Seller s where s.name = :name")
    public Seller getSellerByName(@Param("name") String name);

}
