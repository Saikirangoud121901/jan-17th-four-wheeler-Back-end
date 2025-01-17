package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserLogin;
import com.example.demo.repo.UserRepo;
 @Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	
	public UserLogin saveDetails(UserLogin userLogin) {
		
		return userRepo.save(userLogin);
	}
	
	
	
	

	public boolean showDetails(String userName, String password) {
try {
			
			UserLogin userLogin = userRepo.findById(userName).get();
			if(userLogin !=null) {
				if(userLogin.getUserName().contentEquals(userName)) {
					if(userLogin.getPassword().contentEquals(password)) {
						return true;
					}
				}
			}
				
		}catch(Exception e) {
			return false;
		}
		
		return false;
	}

}
