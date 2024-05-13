package com.domain.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
