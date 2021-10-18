package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestapimariadbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapimariadbApplication.class, args);
	}

	@RequestMapping("/api")
	public String index() {
		return "Olá API REST!";
	}

}
