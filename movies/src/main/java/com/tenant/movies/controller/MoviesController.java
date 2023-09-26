package com.tenant.movies.controller;

import com.tenant.movies.controller.mapper.ControllerMapper;
import com.tenant.movies.service.MoviesService;
import jakarta.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class MoviesController {

    @Autowired
    ControllerMapper controllerMapper;
    @Autowired
    MoviesService moviesService;

    @GetMapping
    public ResponseEntity<List<MovieResponse>> getMovies(@QueryParam("available") String available) {

        HashMap<String,String> parameters = new HashMap<>();
        parameters.put("available", available);

        return ResponseEntity.ok(
                moviesService.getMovies(parameters).stream().map(
                        controllerMapper::movieModelToController
                ).collect(Collectors.toList()));

    }
}
