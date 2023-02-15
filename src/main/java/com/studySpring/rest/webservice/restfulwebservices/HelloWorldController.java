package com.studySpring.rest.webservice.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@GetMapping(path = "/hello-world")
	private String retrieveAnswer() {
		return "Hello-world!";
	}
}
