package co.edu.unbosque.moviestutorial.resources;

import co.edu.unbosque.moviestutorial.resources.pojos.MoviePOJO;
import co.edu.unbosque.moviestutorial.services.MovieService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/movies")
public class MoviesResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(MoviePOJO movie) {

        movie = new MovieService().saveMovie(movie.getTitle(), movie.getYear(), movie.getTime(), movie.getLang(),
                movie.getCountry());

        return Response.status(Response.Status.CREATED)
                .entity(movie)
                .build();
    }
}