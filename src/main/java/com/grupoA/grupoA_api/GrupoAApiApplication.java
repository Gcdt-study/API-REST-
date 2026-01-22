package com.grupoA.grupoA_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.grupoA.grupoA_api")
public class GrupoAApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(GrupoAApiApplication.class, args);
	}

}
