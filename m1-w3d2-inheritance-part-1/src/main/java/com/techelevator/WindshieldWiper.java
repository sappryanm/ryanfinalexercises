package com.techelevator;

public class WindshieldWiper extends Product{
	private int wiperLength;
	private boolean driversSide;
	
	
	public int getWiperLength() {
		return wiperLength;
	}
	public void setWiperLength(int wiperLength) {
		this.wiperLength = wiperLength;
	}
	public boolean isDriversSide() {
		return driversSide;
	}
	public void setDriversSide(boolean driversSide) {
		this.driversSide = driversSide;
	}
	public WindshieldWiper(long id, String name, String manufacturer, double weight, double price, int wiperLength,
			boolean driversSide) {
		super(id, name, manufacturer, weight, price);
		this.wiperLength = wiperLength;
		this.driversSide = driversSide;
	}
	

}
