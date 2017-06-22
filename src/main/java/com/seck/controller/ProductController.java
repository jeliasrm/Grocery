package com.seck.controller;

import com.seck.model.Product;
import com.seck.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by elias on 20/06/17.
 */
@Controller
//@WebAppConfiguration
public class ProductController {


    @Autowired
    private IProductService productService;

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public String get(Model model, @PathVariable("id") String search){

        Product product = new Product();

        try {
            int id = Integer.parseInt(search);
            product = productService.findProductById(id);
        }catch (Exception e){
            String id = search;
            product = productService.findProductByName(id);
        }finally {
            model.addAttribute("product",product);
            return "views/product";
        }
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String get(Model model){

        List<Product> products;
        products = productService.getProducts(true);
        model.addAttribute("products",products);
        return "views/product";
    }

    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product product){

            productService.addProduct(product);


        return "views/addproduct";
    }

}
