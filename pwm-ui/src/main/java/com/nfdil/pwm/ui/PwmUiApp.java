package com.nfdil.pwm.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.nfdil.pwm")
@EntityScan("com.ndfil.pwm.entity.entities")
@EnableJpaRepositories("com.nfdil.pwm.repository")
public class PwmUiApp {

	public static void main(String[] args) {
		SpringApplication.run(PwmUiApp.class, args);
	}
}
