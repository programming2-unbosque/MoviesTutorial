package co.edu.unbosque.moviestutorial.resources;

import co.edu.unbosque.moviestutorial.resources.pojos.CastPOJO;
import co.edu.unbosque.moviestutorial.services.CastService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/casts")
public class CastResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(CastPOJO cast) {

        cast = new CastService().saveCast(cast.getMovieId(), cast.getAuthorId(), cast.getRole());

        return Response.status(Response.Status.CREATED)
                .entity(cast)
                .build();
    }
}
