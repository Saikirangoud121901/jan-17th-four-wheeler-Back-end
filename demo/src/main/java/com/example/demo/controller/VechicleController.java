package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.VechicleEntity;
import com.example.demo.service.VechicleService;

@RestController
public class VechicleController {
	@Autowired
	VechicleService vechicleService;

	@PostMapping("/add/vechicle")
	public VechicleEntity AddNewVechicle(@RequestBody VechicleEntity vechicleEntity ) {
		return vechicleService.SaveNewVechicle(vechicleEntity);
	}
	@GetMapping("/get/all/vechicle")
	public VechicleEntity getAllVechicle(@RequestBody VechicleEntity vechicleEntity ) {
		return vechicleService.SaveNewVechicle(vechicleEntity);

}
}