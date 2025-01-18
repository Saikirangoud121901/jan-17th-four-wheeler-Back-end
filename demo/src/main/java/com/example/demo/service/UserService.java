package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserLogin;
import com.example.demo.repo.UserRepo;
 @Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	
	public String saveDetails(UserLogin userLogin) {
		String res="";
		try {
		userRepo.save(userLogin);
		res="Succesfully saves new user----->"+userLogin.getUserName();
		
		}catch (Exception e) {
			res="not able to save new user----->"+userLogin.getUserName();
		}
		
		return res;
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
