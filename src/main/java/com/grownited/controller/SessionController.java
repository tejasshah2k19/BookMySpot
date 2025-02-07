package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

	// logic
	// jsp open --> Signup --> url --? signup

	// 1) method
	// 2) return jsp open
	// 3) assign the url

	@GetMapping("signup")
	public String signup() {
		//
		return "Signup"; // jsp Name
	}

	@GetMapping("login")
	public String login() {
		return "Login";
	}
}
