package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserLogin;
import com.example.demo.service.UserService;


@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/LoginDetails/add")
	public String AddNewUser(@RequestBody UserLogin userLogin) {
		
		String res= userService.saveDetails(userLogin);	
	return res;
	}
	
	@GetMapping("/LoginDetails/get")
	public boolean AddNewUser(@RequestParam String userName, String password) {
	     return userService.showDetails(userName,password);		
	}
	
}
