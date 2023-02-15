package com.studySpring.rest.webservice.restfulwebservices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int counterId = 0;
	
	static {
		users.add(new User(++counterId,"John",LocalDate.now().minusYears(20)));
		users.add(new User(++counterId,"George",LocalDate.now().minusYears(30)));
		users.add(new User(++counterId,"Kostas",LocalDate.now().minusYears(15)));
		users.add(new User(++counterId,"Ria",LocalDate.now().minusYears(28)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		user.setId(++counterId);
		users.add(user);
		return user;
	}
	
}
