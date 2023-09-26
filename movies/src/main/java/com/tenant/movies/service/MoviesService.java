package com.tenant.movies.service;

import com.tenant.movies.model.Movie;

import java.util.HashMap;
import java.util.List;

public interface MoviesService {
    List<Movie> getMovies(HashMap<String,String> parameters);
}
