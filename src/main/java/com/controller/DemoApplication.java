package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.service","com.controller"})
@EntityScan("com.entity")
@EnableJpaRepositories({"com.repository"})
@SpringBootApplication
public class DemoApplication {
		public static void main(final String[] args) {
			SpringApplication.run(DemoApplication.class, args);
		}
}
