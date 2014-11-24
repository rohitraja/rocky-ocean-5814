package com.example.services;

import com.example.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class TimeService {

    @GET
    @Path("/time")
    @Produces(MediaType.APPLICATION_JSON)
    public Time get() {
        return new Time();
    }
    
    
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_HTML)

    public String Test2()
    {
    	return "Hi This is Amresh";
    	
    }
    
    
    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String Test()
    {
    	return "Hi This is Mohit ";
    	
    }
    
    
    

    
    
    @PUT
    @Path("/HiThere/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String HiThere(@PathParam ("name") String name)
    {
    	return "Hi " + name + "This is Rohit ";
    	
    }
    
    public String value()
    {
    	return "added String";
    }

}

