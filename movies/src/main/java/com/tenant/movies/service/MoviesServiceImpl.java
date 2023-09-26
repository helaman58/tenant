package com.tenant.movies.service;

import com.tenant.movies.model.Movie;
import com.tenant.movies.repository.MoviesRepository;
import com.tenant.movies.service.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    MovieMapper movieMapper;
    @Autowired
    MoviesRepository moviesRepository;
    @Override
    public List<Movie> getMovies(HashMap<String,String> parameters) {

        return StreamSupport.stream(moviesRepository.findAll().spliterator(), false)
                .map(movieMapper::movieEntityToModel).collect(Collectors.toList());
    }
}
