package com.qa.rest;

import java.util.Optional;

import com.qa.persistence.domain.Movie;

public interface IMovieEndpoint {

	public Movie createMovie(Movie movie);

	public String deleteMovie(Long id);

	public Movie updateMovie(Long id, Movie movie);

	public Iterable<Movie> getAllMovies();

	public Optional<Movie> getMovie(Long id);
}
