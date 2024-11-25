package com.micro.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.micro.school.client")
//Feign is a declarative web service client in Spring Boot, typically used to simplify HTTP communication between microservices.
// The @FeignClient annotation in Spring Cloud OpenFeign enables you to define a client interface for making HTTP requests to other services without writing boilerplate code.
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

}
