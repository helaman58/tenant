package com.tenant.movies.controller.mapper;

import com.tenant.movies.controller.MovieResponse;
import com.tenant.movies.model.Movie;
import org.mapstruct.Mapper;

@Mapper
public interface ControllerMapper {
    MovieResponse movieModelToController(Movie movie);
}
