package com.xworkz.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	private static final Logger logger = Logger.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {

		System.setProperty("server.servlet.context-path", "/springboot");
		SpringApplication.run(SpringbootApplication.class, args);
		logger.info("SpringbootApplication ended");
	}
}
