package co.edu.unbosque.moviestutorial.jpa.repositories;

import co.edu.unbosque.moviestutorial.jpa.entities.Movie;

import javax.persistence.EntityManager;
import java.util.Optional;

public class MovieRepositoryImpl implements MovieRepository {

    private EntityManager entityManager;

    public MovieRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Movie> findById(Integer id) {
        Movie author = entityManager.find(Movie.class, id);
        return author != null ? Optional.of(author) : Optional.empty();
    }

    @Override
    public Optional<Movie> save(Movie movie) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(movie);
            entityManager.getTransaction().commit();
            return Optional.of(movie);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
