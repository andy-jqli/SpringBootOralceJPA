package com.akhil.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
public class JpaOracleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOracleDemoApplication.class, args);
	}

}

