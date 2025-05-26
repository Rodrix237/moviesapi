package com.example.moviesapi.controller;

import com.example.moviesapi.service.MovieService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Unit tests for MovieController.
 */
@WebMvcTest(MovieController.class)
class MovieControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MovieService movieService;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Test that the /api/movies endpoint returns exactly 20 movies.
     */
    @Test
    void getAllMovies_ShouldReturn20Movies() throws Exception {
        // Given
        when(movieService.getAllMovies()).thenReturn(Collections.nCopies(20, null));

        // When & Then
        mockMvc.perform(get("/api/movies"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.length()").value(20));
    }

    /**
     * Test that the /api/movies endpoint returns proper HTTP status and content type.
     */
    @Test
    void getAllMovies_ShouldReturnCorrectContentTypeAndStatus() throws Exception {
        // Given
        when(movieService.getAllMovies()).thenReturn(Collections.emptyList());

        // When & Then
        mockMvc.perform(get("/api/movies"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}