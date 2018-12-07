package com.qa.util;

import org.springframework.stereotype.Component;

import com.qa.persistence.domain.Movie;

@Component
public class updateMovie {

	public Movie updateMovie(Movie newMovie, Movie oldMovie) {
		newMovie.setId(oldMovie.getId());
		newMovie.setTitle(oldMovie.getTitle());
		newMovie.setActor(oldMovie.getActor());
		newMovie.setDirector(oldMovie.getDirector());
		newMovie.setGenre(oldMovie.getGenre());
		return newMovie;
	}
	
}
