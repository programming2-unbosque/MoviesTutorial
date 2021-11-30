package co.edu.unbosque.moviestutorial.services;

import co.edu.unbosque.moviestutorial.jpa.entities.Actor;
import co.edu.unbosque.moviestutorial.jpa.entities.Cast;
import co.edu.unbosque.moviestutorial.jpa.repositories.CastRepository;
import co.edu.unbosque.moviestutorial.jpa.repositories.CastRepositoryImpl;
import co.edu.unbosque.moviestutorial.resources.pojos.ActorPOJO;
import co.edu.unbosque.moviestutorial.resources.pojos.CastPOJO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

public class CastService {

    CastRepository castRepository;

    public CastPOJO saveCast(Integer movieId, Integer actorId, String role) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        castRepository = new CastRepositoryImpl(entityManager);

        Optional<Cast> cast = castRepository.save(new Cast(role), movieId, actorId);

        entityManager.close();
        entityManagerFactory.close();

        CastPOJO castPOJO = null;
        if (cast.isPresent()) {
            castPOJO = new CastPOJO(cast.get().getCastId(), cast.get().getMovie(), cast.get().getActor(), cast.get().getRole());
        }

        return castPOJO;
    }
}
