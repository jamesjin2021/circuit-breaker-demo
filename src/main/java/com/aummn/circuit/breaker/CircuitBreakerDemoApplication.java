package com.aummn.circuit.breaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class CircuitBreakerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerDemoApplication.class, args);
	}

}
