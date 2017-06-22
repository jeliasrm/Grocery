package com.seck.service.impl;

import com.seck.model.Product;
import com.seck.repository.IProductRepository;
import com.seck.service.IProductService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by elias on 20/06/17.
 */
@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product findProductById(int id) {

        return productRepository.getProductById(id);
    }

    @Override
    public Product findProductByName(String name) {

        return productRepository.getProductByName(name);
    }

    @Override
    public List<Product> getProducts(Boolean active) {
        return productRepository.getProducts(true);
    }

    @Transactional
    public void addProduct(Product product) {

        productRepository.save(product);
    }
}
