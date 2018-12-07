package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.qa.persistence.repository.IMovieRepo;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = IMovieRepo.class)
public class MovieApiSpringApplication {



	public static void main(String[] args) {
		SpringApplication.run(MovieApiSpringApplication.class, args);
	}

}
