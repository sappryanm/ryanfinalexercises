package com.techelevator;

public class Seat extends Product {
	private String materialType;
	private boolean hasHeater;
	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public boolean isHasHeater() {
		return hasHeater;
	}

	public void setHasHeater(boolean hasHeater) {
		this.hasHeater = hasHeater;
	}

	public Seat(long id, String name, String manufacturer, double weight, double price) {
		super(id, name, manufacturer, weight, price);
		// TODO Auto-generated constructor stub
	}

	public Seat(long id, String name, boolean isbought) {
		super(id, name, isbought);
		// TODO Auto-generated constructor stub
	}

	public Seat(long id, String name, String manufacturer, double weight, double price, String materialType,
			boolean hasHeater) {
		super(id, name, manufacturer, weight, price);
		this.materialType = materialType;
		this.hasHeater = hasHeater;
	}

}
