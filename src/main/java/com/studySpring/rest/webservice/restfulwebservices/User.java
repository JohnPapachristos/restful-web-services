package com.studySpring.rest.webservice.restfulwebservices;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	private Integer id;
	@Size(min = 2)
	private String name;
	@Past
	private LocalDate birthDate;
	
	public User(final Integer id, final String name, final LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + "\nName: " + this.name + "\nBirthDate: " + this.birthDate;
	}
	
}
