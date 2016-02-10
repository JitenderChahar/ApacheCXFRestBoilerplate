package com.dzee.gslab.rest.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.dzee.gslab.dao.UserDao;
import com.dzee.gslab.rest.UserResource;

public class UserResourceImpl implements UserResource 
{
	
	@Autowired
	private UserDao userDao;

	@Override
	public Response getUserDetail(String username) {
		if(username == null)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}		
		return Response.ok(userDao.getUserDetails(username)).build();
	}
}
