package com.techelevator;

public class DoorHandle extends Product{
	private String isTouchless;
	private int MaterialType;
	public DoorHandle(long id, String name, String manufacturer, double weight, double price) {
		super(id, name, manufacturer, weight, price);
		// TODO Auto-generated constructor stub
	}
	private String getIsTouchless() {
		return isTouchless;
	}
	private void setIsTouchless(String isTouchless) {
		this.isTouchless = isTouchless;
	}
	private int getMaterialType() {
		return MaterialType;
	}
	private void setMaterialType(int materialType) {
		MaterialType = materialType;
	}

	 
	 
	 
	 
}
