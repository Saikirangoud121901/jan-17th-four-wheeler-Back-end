package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.VehicleEntity;
import com.example.demo.entity.VehicleEntity;
import com.example.demo.service.VehicleService;

@RestController
@CrossOrigin("*")
public class VehicleController {
	@Autowired
	VehicleService vehicleService;

	@PostMapping("/add/vechicle")
	public VehicleEntity AddNewVechicle(@RequestBody VehicleEntity vechicleEntity ) {
		return vehicleService.SaveNewVechicle(vechicleEntity);
	}
	@GetMapping("/get/all/vehicle")
	public List<VehicleEntity> getAllVechicle() {
		return vehicleService.fetchAllVehicle();

}
}