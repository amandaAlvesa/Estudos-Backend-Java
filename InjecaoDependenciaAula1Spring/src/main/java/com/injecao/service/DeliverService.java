package com.injecao.service;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {
	public Double deliver(String state) {
		if(state.equalsIgnoreCase("SP")) {
			return 10.0;
		}
		
		return 20.0;
	}
}
