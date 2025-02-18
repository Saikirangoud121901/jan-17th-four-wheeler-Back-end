package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VehicleEntity {
@Id
	private String carName;
	private String price;
	private String Model;
	private String ImgUrl;
	public VehicleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getImgUrl() {
		return ImgUrl;
	}
	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "VehicleEntity [carName=" + carName + ", price=" + price + ", Model=" + Model + ", ImgUrl=" + ImgUrl
				+ "]";
	}
	
	
	
	
}
