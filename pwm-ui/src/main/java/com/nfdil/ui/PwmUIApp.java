package com.nfdil.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.fks")
@EntityScan("com.fks.promo.entity")
@EnableJpaRepositories("com.fks.ui.repository")
public class PwmUIApp {

	public static void main(String[] args) {
		SpringApplication.run(PwmUIApp.class, args);
	}
}
