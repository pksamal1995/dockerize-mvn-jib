package com.docker.mvn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDockerMvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerMvnApplication.class, args);
	}

	@GetMapping("/hello")
	public String getHello() {
		return "Hello from the code";
	}
}
