package com.qa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Movie;
import com.qa.persistence.repository.IMovieRepo;
import com.qa.util.updateMovie;

@Service
public class MovieService implements IMovieService {

	@Autowired
	private IMovieRepo repo;

	@Autowired
	private updateMovie movieUtil;


	@Override
	public Movie createMovie(Movie movie) {
		System.out.println(movie + "Service");
		return repo.save(movie);
	}

	@Override

	public String deleteMovie(Long id) {
		repo.deleteById(id);
		return "Movie deleted";
	}

	@Override
	public Movie updateMovie(Long id, Movie movie) {
		Movie newMovie = movieUtil.updateMovie(repo.findById(id).get(), movie);
		return repo.save(newMovie);
	}

	@Override
	public Iterable<Movie> getAllMovies() {
		return repo.findAll();
	}

	@Override
	public Optional<Movie> getMovie(Long id) {
		return repo.findById(id);
	}

}
