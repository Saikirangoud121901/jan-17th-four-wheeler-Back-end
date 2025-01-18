package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.VehicleEntity;
import com.example.demo.repo.VehicleRepo;

@Service
public class VehicleService {
@Autowired
	VehicleRepo vehicleRepo;
	

public VehicleEntity SaveNewVechicle(VehicleEntity vehicleEntity) {
	return vehicleRepo.save(vehicleEntity);
	}
	

	public List<VehicleEntity> fetchAllVehicle() {
		// TODO Auto-generated method stub
		return vehicleRepo.findAll();
	
	
	

}
}