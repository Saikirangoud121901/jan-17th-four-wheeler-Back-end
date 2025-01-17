package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserLogin;

public interface UserRepo extends JpaRepository<UserLogin, String>{

}
