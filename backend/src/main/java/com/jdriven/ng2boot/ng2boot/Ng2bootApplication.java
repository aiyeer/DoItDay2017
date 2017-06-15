package com.jdriven.ng2boot.ng2boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.jdriven.ng2boot.model")
public class Ng2bootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ng2bootApplication.class, args);
	}
}
