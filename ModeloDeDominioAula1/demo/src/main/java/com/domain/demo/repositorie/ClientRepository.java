package com.domain.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.demo.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
