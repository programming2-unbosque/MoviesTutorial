package co.edu.unbosque.moviestutorial.jpa.repositories;

import co.edu.unbosque.moviestutorial.jpa.entities.Actor;

import javax.persistence.EntityManager;
import java.util.Optional;

public class ActorRepositoryImpl implements ActorRepository {

    private EntityManager entityManager;

    public ActorRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Actor> save(Actor actor) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(actor);
            entityManager.getTransaction().commit();
            return Optional.of(actor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
