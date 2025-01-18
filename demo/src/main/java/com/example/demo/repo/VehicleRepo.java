package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.VehicleEntity;

public interface VehicleRepo  extends JpaRepository <VehicleEntity,String>{

}
