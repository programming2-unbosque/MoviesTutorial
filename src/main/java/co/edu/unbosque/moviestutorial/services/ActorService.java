package co.edu.unbosque.moviestutorial.services;

import co.edu.unbosque.moviestutorial.jpa.entities.Actor;
import co.edu.unbosque.moviestutorial.jpa.repositories.ActorRepository;
import co.edu.unbosque.moviestutorial.jpa.repositories.ActorRepositoryImpl;
import co.edu.unbosque.moviestutorial.resources.pojos.ActorPOJO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

public class ActorService {

    ActorRepository actorRepository;

    public ActorPOJO saveActor(String name) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        actorRepository = new ActorRepositoryImpl(entityManager);

        Optional<Actor> actor = actorRepository.save(new Actor(name));

        entityManager.close();
        entityManagerFactory.close();

        ActorPOJO actorPOJO = null;
        if (actor.isPresent()) {
            actorPOJO = new ActorPOJO(actor.get().getActorId(), actor.get().getName());
        }

        return actorPOJO;
    }
}
