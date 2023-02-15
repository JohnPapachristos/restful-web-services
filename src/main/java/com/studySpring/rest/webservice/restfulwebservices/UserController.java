package com.studySpring.rest.webservice.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers(){
		return userDaoService.findAll();
	}
	
	@GetMapping(path = "/user/find-one/{id}")
	public User retrieveOneUser(@PathVariable int id) {
		if(id <= userDaoService.findAll().size() && id >=0) {
			return userDaoService.findAll().get(id - 1);
		}
		return null;
		
	}
	
	@PostMapping(path = "/users")
	public void createUser(@RequestBody User user) {
		userDaoService.save(user);
	}
	
}
