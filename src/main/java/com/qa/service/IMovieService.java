package com.qa.service;

import java.util.Optional;

import com.qa.persistence.domain.Movie;

public interface IMovieService {

	public Movie createMovie(Movie movie);

	public String deleteMovie(Long id);

	public Movie updateMovie(Long id, Movie movie);

	public Iterable<Movie> getAllMovies();

	public Optional<Movie> getMovie(Long id);

}
