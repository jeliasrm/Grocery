package com.seck.service;

import com.seck.model.Product;

import java.util.List;

/**
 * Created by elias on 20/06/17.
 */
public interface IProductService {

    Product findProductById(int id);

    Product findProductByName(String name);

    List<Product> getProducts(Boolean active);

    void addProduct(Product product);

}
