package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.service"})
@EntityScan("com.entity")
@EnableJpaRepositories("com.repository")
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		JpaRepositoriesAutoConfiguration.class
})
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		SpringApplication application = new SpringApplication(DemoApplication.class);
        application.setWebEnvironment(false);
        application.run(args);
	}
}
