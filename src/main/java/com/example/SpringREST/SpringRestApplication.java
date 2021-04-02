package com.example.SpringREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.SpringREST")
public class SpringRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

}
