package com.domain.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
