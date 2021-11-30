package co.edu.unbosque.moviestutorial.jpa.repositories;

import co.edu.unbosque.moviestutorial.jpa.entities.Actor;
import co.edu.unbosque.moviestutorial.jpa.entities.Cast;
import co.edu.unbosque.moviestutorial.jpa.entities.Movie;

import javax.persistence.EntityManager;
import java.util.Optional;

public class CastRepositoryImpl implements CastRepository {

    private EntityManager entityManager;

    public CastRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Cast> save(Cast cast, Integer movieId, Integer actorId) {
        try {
            entityManager.getTransaction().begin();

            Movie movie = entityManager.find(Movie.class, movieId);
            cast.setMovie(movie);
            System.out.println("Movie returned: " + movie.getTitle());

            Actor actor= entityManager.find(Actor.class, actorId);
            cast.setActor(actor);
            System.out.println("Actor returned: " + actor.getName());

            entityManager.persist(cast);
            entityManager.getTransaction().commit();
            return Optional.of(cast);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
