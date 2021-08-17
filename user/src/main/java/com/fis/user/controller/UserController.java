package com.fis.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//import com.fis.repository.UserRepository;
//import com.fis.springlearn.service.AppUserDetailsService;
import com.fis.user.bean.User;

@RestController
@RequestMapping("/users")

public class UserController {
	
	@GetMapping ("/{number}")
	public User getUser(@PathVariable long number)
	{
		return new User("Anthony",675);
	}

}
