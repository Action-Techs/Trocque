package com.example.StoreFront.products;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Inject;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.StoreFront.util.annotations.Inject;

import java.util.ArrayList;

@Service
public class ProductService {

    @Inject
    private final ProductsRepository productRepository;

//    @Bean(name="entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//        return sessionFactory;
//    }

    @Inject
    @Autowired
    public ProductService(ProductsRepository productRepository) {
        this.productRepository = productRepository;
    }

    //For the Queries
    public Products getProductById(Integer id) {
        return productRepository.getProductById(id);
    }

    public Products getProductByName(String name) {
        return productRepository.getProductByName(name);
    }

    public ArrayList<Products> getProductsByPrice(double price) {
        return productRepository.getProductsByPrice(price);
    }

    public ArrayList<Products> getAllProducts() {
        return productRepository.getAllProducts();
    }
}

