package com.studySpring.rest.webservice.restfulwebservices.helloWorld;

public class HelloWorldBean {
	private String message;
	
	public HelloWorldBean(final String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message: " + this.message;
	}
	
}
