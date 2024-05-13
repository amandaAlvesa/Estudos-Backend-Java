package com.domain.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
