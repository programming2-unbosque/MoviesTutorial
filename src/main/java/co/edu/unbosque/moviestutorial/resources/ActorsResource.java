package co.edu.unbosque.moviestutorial.resources;

import co.edu.unbosque.moviestutorial.resources.pojos.ActorPOJO;
import co.edu.unbosque.moviestutorial.services.ActorService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/actors")
public class ActorsResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(ActorPOJO actor) {

        actor = new ActorService().saveActor(actor.getName());

        return Response.status(Response.Status.CREATED)
                .entity(actor)
                .build();
    }
}