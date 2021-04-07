package com.wolken.wolkenapp.dto;

public class MobileDTO {

	private int mobileId;
	private String modelName;
	private double price;
	private double memory;
	private String brandName;
	private String serialNumber;
	private int numberOfCamera;
	
	public MobileDTO() {
		// TODO Auto-generated constructor stub
		
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getNumberOfCamera() {
		return numberOfCamera;
	}

	public void setNumberOfCamera(int numberOfCamera) {
		this.numberOfCamera = numberOfCamera;
	}
	
	
}
