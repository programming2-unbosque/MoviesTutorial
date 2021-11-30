package co.edu.unbosque.moviestutorial.resources.pojos;

import co.edu.unbosque.moviestutorial.jpa.entities.Actor;
import co.edu.unbosque.moviestutorial.jpa.entities.Movie;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CastPOJO {

    private Integer castPOJO;

    private Integer movieId;

    private Movie movie;

    private Integer authorId;

    private Actor actor;

    private String role;

    public CastPOJO() {
    }

    public CastPOJO(Integer movieId, Integer authorId, String role) {
        this.movieId = movieId;
        this.authorId = authorId;
        this.role = role;
    }

    public CastPOJO(Integer castPOJO, Movie movie, Actor actor, String role) {
        this.castPOJO = castPOJO;
        this.movie = movie;
        this.actor = actor;
        this.role = role;
    }

    public Integer getCastPOJO() {
        return castPOJO;
    }

    public void setCastPOJO(Integer castPOJO) {
        this.castPOJO = castPOJO;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
