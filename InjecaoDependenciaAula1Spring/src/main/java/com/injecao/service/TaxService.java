package com.injecao.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
	public double tax(double valor) {
		return valor * 0.1;
	}
}
