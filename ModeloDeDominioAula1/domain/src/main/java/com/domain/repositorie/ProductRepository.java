package com.domain.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
