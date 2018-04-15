package com.hercule.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.hercule.product.repositories")
@ComponentScan("com.hercule.*")
public class ProductDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDatabaseApplication.class, args);
	}
	
}
