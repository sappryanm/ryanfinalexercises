package com.techelevator;

public class Salaried implements WorkerInterface {
	private double weeklySalary;
	private int annualSalary;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ryan";
	}
	@Override
	public int getHoursWorked() {
		// TODO Auto-generated method stub
		return 40;
	}
	public double getAnnualSalary() {
		annualSalary = 1000000;
		return annualSalary;
	}
	public double weeklySalary() {
		this.weeklySalary = annualSalary /52;
		return weeklySalary;
		
		//pay = annual salary / 52
	}
	@Override
	public Double pay() {

		return weeklySalary;
	}


}
