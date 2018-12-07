package com.qa.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Movie;
import com.qa.service.IMovieService;

@RestController
@RequestMapping("${endpoint.base}")
public class MovieEndpoint implements IMovieEndpoint {

	@Autowired
	private IMovieService service;

	@Override
	@PostMapping("${endpoint.create}")
	public Movie createMovie(@RequestBody Movie movie) {
		System.out.println(movie + "Endpoint");
		return service.createMovie(movie);
	}

	@Override
	@DeleteMapping("${endpoint.delete}")
	public String deleteMovie(@PathVariable("id") Long id) {
		return service.deleteMovie(id);
	}

	@Override
	@PutMapping("${endpoint.update}")
	public Movie updateMovie(@PathVariable("id") Long id, @RequestBody Movie movie) {
		return service.updateMovie(id, movie);
	}

	@Override
	@GetMapping("${endpoint.getall}")
	public Iterable<Movie> getAllMovies() {
		return service.getAllMovies();
	}

	@Override
	@GetMapping("${endpoint.get}")
	public Optional<Movie> getMovie(@PathVariable Long id) {
		return service.getMovie(id);
	}

}
