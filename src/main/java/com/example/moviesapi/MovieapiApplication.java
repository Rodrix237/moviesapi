package com.example.moviesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Movies API.
 * This class bootstraps the Spring Boot application.
 */
@SpringBootApplication
public class MovieapiApplication {

	/**
	 * Main method to start the Spring Boot application.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(MovieapiApplication.class, args);
	}
}