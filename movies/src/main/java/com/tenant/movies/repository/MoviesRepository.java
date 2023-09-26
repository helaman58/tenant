package com.tenant.movies.repository;

import com.tenant.movies.repository.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movie,String> {
}
