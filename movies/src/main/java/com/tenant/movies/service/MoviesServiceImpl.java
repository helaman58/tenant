package com.tenant.movies.service;

import org.springframework.stereotype.Service;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Override
    public String getMovies() {
        return "Hola mundo!";
    }
}
