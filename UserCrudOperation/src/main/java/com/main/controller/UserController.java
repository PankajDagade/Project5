package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.User;
import com.main.service.UserService;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	
	@PostMapping("/saveData")
	public ResponseEntity<User> post(@RequestBody User user)
	{
		User u = userService.postData(user);
		
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	@PatchMapping("/s")
	public ResponseEntity<String> s()
	{
		System.out.println("Pankaj");
		
		return "Pankaj";
	}

}
