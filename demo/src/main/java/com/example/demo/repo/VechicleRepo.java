package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.VechicleEntity;

public interface VechicleRepo  extends JpaRepository <VechicleEntity,String>{

}
