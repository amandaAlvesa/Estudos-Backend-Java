package com.domain.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.demo.entities.OrderItem;

public interface orderItemRepository extends JpaRepository<OrderItem, Long>{

}
