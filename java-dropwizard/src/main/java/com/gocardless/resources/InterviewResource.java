package com.gocardless.resources;

import com.gocardless.api.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/hello")
public class InterviewResource {
    private static final String MESSAGE = "Hello, world!";

    @GET
    @Produces(APPLICATION_JSON)
    public Message hello() {
        return new Message(MESSAGE);
    }
}
