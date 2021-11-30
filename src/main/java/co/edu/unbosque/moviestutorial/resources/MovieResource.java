package co.edu.unbosque.moviestutorial.resources;

import co.edu.unbosque.moviestutorial.resources.pojos.MoviePOJO;
import co.edu.unbosque.moviestutorial.services.MovieService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/movies/{movieId}")
public class MovieResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("movieId") Integer movieId) {

        MoviePOJO movie = new MovieService().getMovie(movieId);

        return Response.status(Response.Status.OK)
                .entity(movie)
                .build();
    }
}
