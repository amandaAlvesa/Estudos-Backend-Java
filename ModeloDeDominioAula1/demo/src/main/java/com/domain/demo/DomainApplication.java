package com.domain.demo;

import java.lang.reflect.Array;
import java.sql.Time;
import java.time.Instant;
import java.util.Arrays;

import org.apache.logging.log4j.CloseableThreadContext.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.demo.entities.Client;
import com.domain.demo.entities.Order;
import com.domain.demo.entities.OrderStatus;
import com.domain.demo.entities.Product;
import com.domain.demo.repositorie.ClientRepository;
import com.domain.demo.repositorie.OrderRepository;
import com.domain.demo.repositorie.ProductRepository;

@SpringBootApplication
public class DomainApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepositorie;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "amanda");
		Product p1 = new Product(null, "mouse", 30.0);
		
		productRepositorie.save(p1);
		clientRepository.save(c1);
		
		Order o1 =  new Order(null, Instant.parse("2021-04-18T11:25:09Z"),OrderStatus.PAID ,c1);
		Order o2 =  new Order(null, Instant.parse("2021-04-28T21:25:09Z"),OrderStatus.WAITING ,c1);
		
		orderRepository.saveAll(Arrays.asList(o1,o2));
	}

}
