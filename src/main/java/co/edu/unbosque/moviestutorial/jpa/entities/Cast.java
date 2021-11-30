package co.edu.unbosque.moviestutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "MovieCast")
public class Cast {

    @Id
    @GeneratedValue
    @Column(name = "castId")
    private Integer castId;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "actorId")
    private Actor actor;

    @Column(name = "role", nullable = false)
    private String role;

    public Cast() {
    }

    public Cast(String role) {
        this.role = role;
    }

    public Integer getCastId() {
        return castId;
    }

    public void setCastId(Integer castId) {
        this.castId = castId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
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
