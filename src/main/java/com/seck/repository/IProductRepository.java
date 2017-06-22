package com.seck.repository;

import com.seck.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by elias on 19/06/17.
 */
@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.id_product = :id_product")
    public Product getProductById(@Param("id_product") int id_product);

//    @Query("select n from Product p where p.id_product = :id_product")
//    public String getProductOutofStock(@Param("name") int id_product);

    @Query("select p from Product p where p.name = :name")
    public Product getProductByName(@Param("name") String name);

    @Query("select p from Product p where p.active = :active")
    public List<Product> getProducts(@Param("active") Boolean active);

}
