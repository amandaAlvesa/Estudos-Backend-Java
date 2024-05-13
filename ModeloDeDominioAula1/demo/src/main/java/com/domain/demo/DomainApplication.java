package com.domain.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.demo.entities.Client;
import com.domain.demo.entities.Product;
import com.domain.demo.repositorie.ClientRepository;
import com.domain.demo.repositorie.ProductRepository;

@SpringBootApplication
public class DomainApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepositorie;
	
	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "amanda");
		Product p1 = new Product(null, "mouse", 30.0);
		
		productRepositorie.save(p1);
		clientRepository.save(c1);
		
	}

}
