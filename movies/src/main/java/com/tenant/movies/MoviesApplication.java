package com.tenant.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableTransactionManagement
public class MoviesApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}


	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
}
