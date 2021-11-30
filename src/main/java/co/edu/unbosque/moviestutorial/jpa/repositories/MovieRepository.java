package co.edu.unbosque.moviestutorial.jpa.repositories;

import co.edu.unbosque.moviestutorial.jpa.entities.Movie;

import java.util.Optional;

public interface MovieRepository {

    Optional<Movie> findById(Integer id);

    Optional<Movie> save(Movie movie);
}
