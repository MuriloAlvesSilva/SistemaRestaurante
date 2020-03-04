package com.company.sistemaRestaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SistemaRestauranteApplication {

	 @Bean
	 public ResourceBundleMessageSource messageSource() {

	        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	        source.setBasenames("messages"); 
	        source.setUseCodeAsDefaultMessage(true);

	        return source;
	}
	 
	public static void main(String[] args) {
		SpringApplication.run(SistemaRestauranteApplication.class, args);
	}

}
