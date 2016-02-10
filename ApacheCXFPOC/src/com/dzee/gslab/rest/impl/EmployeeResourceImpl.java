package com.dzee.gslab.rest.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.dzee.gslab.dao.EmployeeDao;
import com.dzee.gslab.rest.EmployeeResource;

public class EmployeeResourceImpl implements EmployeeResource {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Response getEmployeeDetail(String employeeId) {
		if (employeeId == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(employeeDao.getEmployeeDetails(employeeId)).build();
	}
}
