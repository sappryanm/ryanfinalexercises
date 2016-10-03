package com.techelevator;

public class Spu extends DeliveryDriver {
	protected double miles;
	public Spu(double rate, double charges) {
		super(rate, charges);
		// TODO Auto-generated constructor stub
	}

	public void four_day_Ground() {
		rate = (weight * 0.0050) * miles;			
	}
	public void two_day_business() {
		rate = (weight * 0.050) * miles;			
	}
	public void nest_day_Ground() {
		rate = (weight * 0.075) * miles;			
	}
	
//	If four-day ground then rate = (weight * 0.0050) * distance
//			If two-day business then rate = (weight * 0.050) * distance
//			if next day then rate = (weight * 0.075) * distance
}
