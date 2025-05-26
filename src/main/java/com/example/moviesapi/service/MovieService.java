package com.example.moviesapi.service;

import com.example.moviesapi.model.Movie;
import com.example.moviesapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer for movie operations.
 * Handles business logic related to movies.
 */
@Service
public class MovieService {

    private final MovieRepository movieRepository;

    /**
     * Constructor for MovieService.
     *
     * @param movieRepository the movie repository dependency
     */
    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    /**
     * Retrieves all movies.
     *
     * @return a list of all movies
     */
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}