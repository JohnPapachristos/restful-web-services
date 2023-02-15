package com.studySpring.rest.webservice.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers(){
		return userDaoService.findAll();
	}
	
}
