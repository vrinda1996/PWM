package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PromotionJPAApp {
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PromotionJPAApp.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(PromotionJPAApp.class, args);
	}
}
