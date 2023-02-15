package com.studySpring.rest.webservice.restfulwebservices;

import java.net.URI;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		User user = userDaoService.findAll().get(id);
		
		if(Objects.isNull(user)) {
			throw new UserNotFoundException("id: " + id);
		}
		
		return user;
	}
	
	@PostMapping(path = "/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser = userDaoService.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
