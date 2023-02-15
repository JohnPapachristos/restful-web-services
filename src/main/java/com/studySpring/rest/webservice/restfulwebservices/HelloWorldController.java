package com.studySpring.rest.webservice.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@RequestMapping("/hello-world")
	private String retrieveAnswer() {
		return "Hello-world!";
	}
}
