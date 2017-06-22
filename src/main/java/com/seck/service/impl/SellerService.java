package com.seck.service.impl;

import com.seck.model.Seller;
import com.seck.repository.ISellerRepository;
import com.seck.service.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by elias on 20/06/17.
 */
public class SellerService implements ISellerService{

    @Autowired
    private ISellerRepository sellerRepository;

    @Override
    public Seller getSellerByName(String name) {
        return sellerRepository.getSellerByName(name);
    }
}
