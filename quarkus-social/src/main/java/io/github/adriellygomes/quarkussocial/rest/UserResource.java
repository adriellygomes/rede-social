package io.github.adriellygomes.quarkussocial.rest;

import io.github.adriellygomes.quarkussocial.rest.dto.CreateUserRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON) //avisando que vou consumir objetos JSON
@Produces(MediaType.APPLICATION_JSON) //retornar JSON nas minhas respostas
public class UserResource {

    @POST
    public Response createUser(CreateUserRequest userRequest){
        return Response.ok(userRequest).build();
    }

    @GET
    public Response listAllUsers(){
        return Response.ok().build();
    }

}
