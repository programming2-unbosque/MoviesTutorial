package co.edu.unbosque.moviestutorial.services;

import co.edu.unbosque.moviestutorial.jpa.entities.Movie;
import co.edu.unbosque.moviestutorial.jpa.repositories.MovieRepository;
import co.edu.unbosque.moviestutorial.jpa.repositories.MovieRepositoryImpl;
import co.edu.unbosque.moviestutorial.resources.pojos.MoviePOJO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

public class MovieService {

    MovieRepository movieRepository;

    public MoviePOJO getMovie(Integer movieId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        movieRepository = new MovieRepositoryImpl(entityManager);

        Optional<Movie> movie = movieRepository.findById(movieId);

        entityManager.close();
        entityManagerFactory.close();

        MoviePOJO moviePOJO = null;
        if (movie.isPresent()) {
            moviePOJO = new MoviePOJO(movie.get().getMovieId(), movie.get().getTitle(), movie.get().getYear(),
                    movie.get().getTime(), movie.get().getLang(), movie.get().getCountry());
        }

        return moviePOJO;
    }

    public MoviePOJO saveMovie(String title, Integer year, Integer time, String lang, String country) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        movieRepository = new MovieRepositoryImpl(entityManager);

        Optional<Movie> movie = movieRepository.save(new Movie(title, year, time, lang, country));

        entityManager.close();
        entityManagerFactory.close();

        MoviePOJO moviePOJO = null;
        if (movie.isPresent()) {
            moviePOJO = new MoviePOJO(movie.get().getMovieId(), movie.get().getTitle(), movie.get().getYear(),
                    movie.get().getTime(), movie.get().getLang(), movie.get().getCountry());
        }

        return moviePOJO;
    }
}
