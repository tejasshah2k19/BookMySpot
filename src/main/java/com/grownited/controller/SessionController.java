package com.grownited.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;

@Controller
public class SessionController {

	// logic
	// jsp open --> Signup --> url --? signup

	// 1) method
	// 2) return jsp open
	// 3) assign the url
	@Autowired
	UserRepository repositoryUser;
	
	@GetMapping("signup")
	public String signup() {
		//
		return "Signup"; // jsp Name
	}

	@PostMapping("saveuser")
	public String saveUser(UserEntity entityUser) {
		
		entityUser.setRole("USER");
		entityUser.setCreatedAt(new Date());
		entityUser.setActive(true);
		repositoryUser.save(entityUser);//insert query 
		return "Login";
	}
	
	@GetMapping("login")
	public String login() {
		return "Login";
	}
}
