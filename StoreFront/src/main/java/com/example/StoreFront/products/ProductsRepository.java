package com.example.StoreFront.products;

//This will talk to the DB, consider making an h2 DB

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Integer> {
    //Queries for the DB
    @Query (value = "SELECT * FROM products WHERE id = ?1", nativeQuery = true)
    Products getProductById(Integer id);

    @Query (value = "SELECT * FROM products WHERE name = ?1", nativeQuery = true)
    Products getProductByName(String name);

    @Query (value = "SELECT * FROM products WHERE price = ?1", nativeQuery = true)
    ArrayList<Products> getProductsByPrice(double price);

    @Query (value = "SELECT * FROM products", nativeQuery = true)
    ArrayList<Products> getAllProducts();

    //Need to add ability to update/add products

    ArrayList<Products> findByName(String name);
    //Products findById(Integer id);
    ArrayList<Products> findByPrice(double price);
}