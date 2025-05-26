package com.example.moviesapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the Movies API application.
 */
@SpringBootTest
@AutoConfigureWebMvc
class MoviesApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Integration test to verify the /api/movies endpoint returns exactly 20 movies.
     */
    @Test
    void contextLoads_AndApiReturns20Movies() throws Exception {
        mockMvc.perform(get("/api/movies"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.length()").value(20))
                .andExpect(jsonPath("$[0].title").exists())
                .andExpect(jsonPath("$[0].author").exists())
                .andExpect(jsonPath("$[0].releaseYear").exists())
                .andExpect(jsonPath("$[0].description").exists())
                .andExpect(jsonPath("$[0].imageUrl").exists());
    }
}