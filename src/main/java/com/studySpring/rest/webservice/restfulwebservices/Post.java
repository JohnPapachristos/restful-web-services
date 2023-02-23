package com.studySpring.rest.webservice.restfulwebservices;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@GeneratedValue
	private User user;
	
	protected Post() {
		
	}
	
	public Post(final Integer id, final String description) {
		this.id = id;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Id: " + this.id + "\nDescription: " + this.description;
	}
}
