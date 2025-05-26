package com.example.moviesapi.model;

/**
 * Represents a movie with basic information including title, author, release year,
 * description, and image URL.
 */
public class Movie {
    private String title;
    private String author;
    private int releaseYear;
    private String description;
    private String imageUrl;

    /**
     * Default constructor.
     */
    public Movie() {
    }

    /**
     * Constructor with all fields.
     *
     * @param title       the movie title
     * @param author      the movie director/author
     * @param releaseYear the year the movie was released
     * @param description a brief description of the movie
     * @param imageUrl    URL to the movie poster image
     */
    public Movie(String title, String author, int releaseYear, String description, String imageUrl) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    /**
     * Gets the movie title.
     *
     * @return the movie title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the movie title.
     *
     * @param title the movie title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the movie author/director.
     *
     * @return the movie author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the movie author/director.
     *
     * @param author the movie author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the movie release year.
     *
     * @return the release year
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets the movie release year.
     *
     * @param releaseYear the release year
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * Gets the movie description.
     *
     * @return the movie description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the movie description.
     *
     * @param description the movie description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the movie image URL.
     *
     * @return the image URL
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the movie image URL.
     *
     * @param imageUrl the image URL
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
