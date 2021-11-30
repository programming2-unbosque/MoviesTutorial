package co.edu.unbosque.moviestutorial.jpa.repositories;

import co.edu.unbosque.moviestutorial.jpa.entities.Cast;

import java.util.Optional;

public interface CastRepository {

    Optional<Cast> save(Cast cast, Integer movieId, Integer actorId);
}
