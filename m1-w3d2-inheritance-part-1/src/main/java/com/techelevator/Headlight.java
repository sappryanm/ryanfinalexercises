package com.techelevator;

public class Headlight extends Product {

	private int Lumens;
	private int bulbLife;
	public Headlight(long id, String name, String manufacturer, double weight, double price, int lumens, int bulbLife) {
		super(id, name, manufacturer, weight, price);
		Lumens = 100;
		this.bulbLife = bulbLife;
	}

	
	private int getLumens() {
		return Lumens;
	}
	private void setLumens(int lumens) {
		Lumens = lumens;
	}
	private int getBulbLife() {
		return bulbLife;
	}
	private void setBulbLife(int bulbLife) {
		this.bulbLife = bulbLife;
	}
	
}
