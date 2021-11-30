package co.edu.unbosque.moviestutorial.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Actor")
public class Actor {

    @Id
    @GeneratedValue
    @Column(name = "actorId")
    private Integer actorId;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Cast> casts = new ArrayList<>();

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public Actor(Integer actorId, String name) {
        this.actorId = actorId;
        this.name = name;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
