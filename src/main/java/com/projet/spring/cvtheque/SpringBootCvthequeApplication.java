package com.projet.spring.cvtheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootCvthequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCvthequeApplication.class, args);
	}

}
