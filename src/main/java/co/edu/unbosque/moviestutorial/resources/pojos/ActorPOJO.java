package co.edu.unbosque.moviestutorial.resources.pojos;

public class ActorPOJO {

    private Integer actorId;

    private String name;

    public ActorPOJO() {
    }

    public ActorPOJO(Integer actorId, String name) {
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
