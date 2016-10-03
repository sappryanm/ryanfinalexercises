package com.techelevator;

public class FedEd extends DeliveryDriver {

	private double miles;
	private double weight;
	public FedEd(double rate, double charges) {
		super(rate, charges);
		this.miles = 0;
		this.weight = 0.00;
	}
	
	public void milesIncease(double miles) {
		if (miles > 500.00)
			rate = rate + 5;
	}
	public void weightIncrease(double weight) {
		if (weight > 48)
			rate = rate + 3;
	}
	@Override
	public double getRate() {
		return rate = 20;
	}
	
	/*
	public double getShippingCharges()
	   {
	     
	    double charges;
	     
	      if (weight <= 2.0)
	      {
	         charges = (1.10 * (miles / 500 ));
	      }
	      else if ((weight > 2.0) && (weight <= 6.0))
	      {
	         charges = (2.30 * (miles / 500 ));
	      }
	      else if ((weight > 6.0) && (weight <=10.0))
	      {
	         charges = (3.50 * (miles/ 500 ));
	      }
	      else
	      {
	         charges = (4.70 * (miles / 500));
	      }
	 
	      return charges;
	      */
//	rate = 20.00
//			if distance > 500 miles then rate = rate + 5.00
//			if weight > 48 ounces then rate = rate + 3.00
}
