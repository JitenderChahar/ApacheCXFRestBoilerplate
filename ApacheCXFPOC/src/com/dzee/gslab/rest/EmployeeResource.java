package com.dzee.gslab.rest;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@WebService(name = "employeeResource")
public interface EmployeeResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getEmployeeDetail(
			@QueryParam("employeeId") String employeeId);

}
