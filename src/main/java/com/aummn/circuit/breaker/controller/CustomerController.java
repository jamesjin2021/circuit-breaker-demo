package com.aummn.circuit.breaker.controller;

import com.aummn.circuit.breaker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/customer")
class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/name")
	public String customerName() throws RuntimeException {
		try {
			// circuit breaker support
			return customerService.getCustomerNameWithCircuitBreaker();
		} catch (RuntimeException e) {
			throw new RuntimeException("Customer service is down");
		}
	}
}

