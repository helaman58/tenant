package com.tenant.movies.service.mapper;

import com.tenant.movies.model.Movie;
import org.mapstruct.Mapper;

@Mapper
public interface MovieMapper {
    Movie movieEntityToModel(com.tenant.movies.repository.entity.Movie movie);
}
