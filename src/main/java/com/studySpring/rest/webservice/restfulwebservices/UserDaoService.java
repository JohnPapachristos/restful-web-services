package com.studySpring.rest.webservice.restfulwebservices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"John",LocalDate.now().minusYears(20)));
		users.add(new User(2,"George",LocalDate.now().minusYears(30)));
		users.add(new User(3,"Kostas",LocalDate.now().minusYears(15)));
		users.add(new User(4,"Ria",LocalDate.now().minusYears(28)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
}
