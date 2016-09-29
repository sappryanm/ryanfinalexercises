package com.techelevator;

public class Tire extends Product {
	private static String speedRating;
	private static int recommendPSI;
	private static boolean handlesSnow;
	public Tire(long id, String name, String manufacturer, double weight, double price) {
		super(id, name, manufacturer, weight, price);
		// TODO Auto-generated constructor stub
	}

	
	public Tire(long id, String name, String manufacturer, double weight, double price, String speedRating,
			int recommendPSI, boolean handlesSnow) {
		super(id, name, manufacturer, weight, price);
		this.speedRating = "a";
		this.recommendPSI = 100;
		this.handlesSnow = false;
	}

	public static String getSpeedRating() {
		return speedRating;
	}

	public void setSpeedRating(String speedRating) {
		this.speedRating = speedRating;
	}

	public static int getRecommendPSI() {
		return recommendPSI;
	}

	public void setRecommendPSI(int recommendPSI) {
		this.recommendPSI = recommendPSI;
	}

	public static boolean isHandlesSnow() {
		return handlesSnow;
	}

	public void setHandlesSnow(boolean handlesSnow) {
		this.handlesSnow = handlesSnow;
	}


	
}
