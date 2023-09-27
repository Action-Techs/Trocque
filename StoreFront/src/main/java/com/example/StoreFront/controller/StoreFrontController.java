package com.example.StoreFront.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.StoreFront.products.*;
import com.example.StoreFront.users.*;

@RestController
public class StoreFrontController {
    private final ProductService productService;
    //private final UserService userServive;

    StoreFrontController(ProductService productService) {
        this.productService = productService;
    }

    //@GetMapping("/users")
//    public @ResponseBody List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }

    @GetMapping("/products")
    public @ResponseBody ArrayList<Products> getAllProducts() {
        return productService.getAllProducts();
    }

//    @GetMapping("/products/{id}")
//    public @ResponseBody Products getProductById(@PathVariable Integer id) {
//        return productService.getProductById(id);
//    }
}
