package com.injecao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
	
	@Autowired
	private DeliverService deliverService;
	
	@Autowired
	private TaxService taxService;
	
	public double finalPrice(double cost, String state) {
		return cost + deliverService.deliver(state) + taxService.tax(cost);
	}
}
