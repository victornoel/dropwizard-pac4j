package io.dropwizard.pac4j;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/dogs")
@Produces(MediaType.APPLICATION_JSON)
public class DogsResource {
    @GET
    @Path("/{name}")
    public Optional<String> getDog(@PathParam("name") String name) {
        return Optional.of(name);
    }
}
