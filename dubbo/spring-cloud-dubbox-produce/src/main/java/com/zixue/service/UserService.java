
package com.zixue.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/user")
public interface UserService {
 
	//http://127.0.0.1:8081/user/getUser/2
	 @GET
	 @Path("/getUser/{id : \\d+}")
	 @Consumes({MediaType.APPLICATION_JSON})
	 public String getUser(@PathParam("id")Integer id);
	
}
