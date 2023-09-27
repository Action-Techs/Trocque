package com.example.StoreFront;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import static org.springframework.boot.SpringApplication.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import com.example.StoreFront.products.*;

@SpringBootApplication
public class StoreFrontApplication {

	//Logger will help us test d=accessing data for now
	private static final Logger log = LoggerFactory.getLogger(StoreFrontApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StoreFrontApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}


//	public CommandLineRunner demo(ProductsRepository productRepository) {
//		return (args) -> {
//			//create a few Products
//			productRepository.save(new Products("Hair Spray", 10.82));
//			productRepository.save(new Products("Toothpaste", 10.82));
//			productRepository.save(new Products("Shirt", 20.32));
//			productRepository.save(new Products("Crocs", 32.99));
//
//			// fetch all products
//			log.info("Products found with findAll():");
//			log.info("-------------------------------");
//			for (Products products : productRepository.findAll()) {
//				log.info(products.toString());
//			}
//			log.info("");
//
//			// fetch an individual product by ID
//			Products products = productRepository.findById(1);
//			log.info("Product found with findById(1):");
//			log.info("--------------------------------");
//			log.info(products.toString());
//			log.info("");
//
//			// fetch products by name
//			log.info("Products found with findByName('Shirt'):");
//			log.info("--------------------------------------------");
//			productRepository.findByName("Shirt").forEach(shirt -> {
//				log.info(shirt.toString());
//			});
//			log.info("");
//
//			// fetch all products by price
//			log.info("Products found with findByPrice(10.82):");
//			log.info("-------------------------------");
//			for (Products prod : productRepository.findByPrice(10.82)) {
//				log.info(prod.toString());
//			}
//			log.info("");
//
//		};
//	}
}
