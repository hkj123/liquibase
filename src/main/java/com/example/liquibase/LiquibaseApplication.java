package com.example.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class LiquibaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseApplication.class, args);
	}
}
