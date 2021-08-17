package com.fis.user.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.user.bean.User;
import com.fis.user.repository.UserRepository;
//import com.fis.user.service.AppUserDetailsService;

@RestController
@RequestMapping("/users")
public class UserController {

//	@Autowired
//	private AppUserDetailsService appUserDetailsService;
	@Autowired
private UserRepository userRepository;
	@GetMapping("/{username}")
	public User findByUsername(@PathVariable String username) {
		return userRepository.findByUsername(username);
	}
	
}