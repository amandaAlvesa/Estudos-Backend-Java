package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.entities.Client;
import com.domain.entities.Product;
import com.domain.repositorie.ClientRepository;
import com.domain.repositorie.ProductRepository;

@SpringBootApplication
public class DomainApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepositorie;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "amanda", "amanda@gmail.com");
		clientRepositorie.save(c1);
		
		Product p1 = new Product(null, "Mouse", 30.0);
		productRepository.save(p1);
		
	}
	
	

}
