package co.edu.unbosque.moviestutorial.jpa.repositories;

import co.edu.unbosque.moviestutorial.jpa.entities.Actor;

import java.util.Optional;

public interface ActorRepository {

    Optional<Actor> save(Actor actor);
}
