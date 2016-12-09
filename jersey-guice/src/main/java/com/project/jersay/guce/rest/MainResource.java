package com.project.jersay.guce.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/v1/hello")
public class MainResource {
                              //tomcat port/  
    // access http://localhost:8089/jersey-guice/rest/v1/hello
    
	@Inject
	@Named("hello.world.string")
	private String helloWorldString;
	
	@GET
	@Produces("application/json")
	public Response helloWorld(){
		return Response.ok(helloWorldString+"\n").build();
	}
}
