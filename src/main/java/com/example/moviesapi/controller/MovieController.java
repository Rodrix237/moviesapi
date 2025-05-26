package com.example.moviesapi.controller;

import com.example.moviesapi.model.Movie;
import com.example.moviesapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for movie-related endpoints.
 * Provides API endpoints to retrieve movie information.
 */
@RestController
@RequestMapping("/api")
public class MovieController {

    private final MovieService movieService;

    /**
     * Constructor for MovieController.
     *
     * @param movieService the movie service dependency
     */
    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * Retrieves all movies.
     *
     * @return ResponseEntity containing a list of all movies with HTTP 200 status
     */
    @GetMapping(value = "/movies", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }
}