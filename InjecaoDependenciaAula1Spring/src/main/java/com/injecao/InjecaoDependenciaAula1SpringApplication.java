package com.injecao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.injecao.service.PayService;

@SpringBootApplication
public class InjecaoDependenciaAula1SpringApplication implements CommandLineRunner {

	@Autowired
	private PayService payService;
	
	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaAula1SpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Resultado: " + payService.finalPrice(300.0, "p"));		
	}

}
