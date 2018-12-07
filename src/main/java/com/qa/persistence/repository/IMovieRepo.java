package com.qa.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Movie;

@Repository
public interface IMovieRepo extends CrudRepository<Movie, Long> {

}
