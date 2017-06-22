package com.seck.service;

import com.seck.model.Seller;

/**
 * Created by elias on 20/06/17.
 */
public interface ISellerService {

    Seller getSellerByName(String name);
}
