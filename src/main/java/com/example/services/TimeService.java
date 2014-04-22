package com.example.services;

import com.example.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
public class TimeService {

    @GET
    @Path("/time")
    public Time get() {
        return new Time();
    }
    
    @GET
    @Path("/test")
    public String Test()
    {
    	return "Hi This is Rohit ";
    }

}

