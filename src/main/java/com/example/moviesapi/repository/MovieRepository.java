package com.example.moviesapi.repository;

import com.example.moviesapi.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Repository class for managing movie data.
 * This implementation uses a static in-memory list of movies.
 */
@Repository
public class MovieRepository {

    private final List<Movie> movies;

    /**
     * Constructor that initializes the movie repository with a predefined list of 20 movies.
     */
    public MovieRepository() {
        this.movies = Arrays.asList(
                new Movie("The Shawshank Redemption", "Frank Darabont", 1994,
                        "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                        "https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg"),

                new Movie("The Godfather", "Francis Ford Coppola", 1972,
                        "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                        "https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg"),

                new Movie("The Dark Knight", "Christopher Nolan", 2008,
                        "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests.",
                        "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg"),

                new Movie("Pulp Fiction", "Quentin Tarantino", 1994,
                        "The lives of two mob hitmen, a boxer, a gangster and his wife intertwine in four tales of violence and redemption.",
                        "https://image.tmdb.org/t/p/w500/d5iIlFn5s0ImszYzBPb8JPIfbXD.jpg"),

                new Movie("Forrest Gump", "Robert Zemeckis", 1994,
                        "The presidencies of Kennedy and Johnson, the Vietnam War, and other historical events unfold from the perspective of an Alabama man.",
                        "https://image.tmdb.org/t/p/w500/arw2vcBveWOVZr6pxd9XTd1TdQa.jpg"),

                new Movie("Inception", "Christopher Nolan", 2010,
                        "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea.",
                        "https://image.tmdb.org/t/p/w500/9gk7adHYeDvHkCSEqAvQNLV5Uge.jpg"),

                new Movie("The Matrix", "The Wachowskis", 1999,
                        "A computer programmer is led to fight an underground war against powerful computers who have constructed his entire reality with a system called the Matrix.",
                        "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg"),

                new Movie("Goodfellas", "Martin Scorsese", 1990,
                        "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners.",
                        "https://image.tmdb.org/t/p/w500/aKuFiU82s5ISJpGZp7YkIr3kCUd.jpg"),

                new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001,
                        "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth.",
                        "https://image.tmdb.org/t/p/w500/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg"),

                new Movie("Star Wars: Episode V - The Empire Strikes Back", "Irvin Kershner", 1980,
                        "After the Rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda.",
                        "https://image.tmdb.org/t/p/w500/nNAeTmF4CtdSgMDplXTDPOpYzsX.jpg"),

                new Movie("Fight Club", "David Fincher", 1999,
                        "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much more.",
                        "https://image.tmdb.org/t/p/w500/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg"),

                new Movie("Interstellar", "Christopher Nolan", 2014,
                        "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
                        "https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg"),

                new Movie("The Avengers", "Joss Whedon", 2012,
                        "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army.",
                        "https://image.tmdb.org/t/p/w500/RYMX2wcKCBAr24UyPD7xwmjaTn.jpg"),

                new Movie("Titanic", "James Cameron", 1997,
                        "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
                        "https://image.tmdb.org/t/p/w500/9xjZS2rlVxm8SFx8kPC3aIGCOYQ.jpg"),

                new Movie("Jurassic Park", "Steven Spielberg", 1993,
                        "A pragmatic paleontologist visiting an almost complete theme park is tasked with protecting a couple of kids after a power failure causes the park's cloned dinosaurs to run loose.",
                        "https://image.tmdb.org/t/p/w500/b1xCNnyrPebIc7EWNZIa6BYzYau.jpg"),

                new Movie("Avatar", "James Cameron", 2009,
                        "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                        "https://image.tmdb.org/t/p/w500/jRXYjXNq0Cs2TcJjLkki24MLp7u.jpg"),

                new Movie("Gladiator", "Ridley Scott", 2000,
                        "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.",
                        "https://image.tmdb.org/t/p/w500/ty8TGRuvJLPUmAR1H1nRIsgwvim.jpg"),

                new Movie("The Lion King", "Roger Allers", 1994,
                        "A Lion cub crown prince is tricked by a treacherous uncle into thinking he caused his father's death and flees into exile in despair.",
                        "https://image.tmdb.org/t/p/w500/sKCr78MXSLixwmZ8DyJLrpMsd15.jpg"),

                new Movie("Saving Private Ryan", "Steven Spielberg", 1998,
                        "Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.",
                        "https://image.tmdb.org/t/p/w500/uqx37cS8cpHg8U35f9U5IBlmS6a.jpg"),

                new Movie("Schindler's List", "Steven Spielberg", 1993,
                        "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution.",
                        "https://image.tmdb.org/t/p/w500/sF1U4EUQS8YHUYjNl3pMGNIQyr0.jpg")
        );
    }

    /**
     * Retrieves all movies from the repository.
     *
     * @return a list of all movies
     */
    public List<Movie> findAll() {
        return movies;
    }
}