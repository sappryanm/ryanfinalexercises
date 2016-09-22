package com.techelevator.company;

public class Company {

	/*
	 
	 The Company class has the following properties
		name
		numberOfEmployees
		revenue
		expenses
	 	companySize * 
	 	profit **	 

	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * companySize is derived (i.e. calculated), and does not need a setter. A company is "small" if less than 50 employees,
	  	"medium" if between 51 and 250 employees, "large" if greater than 250 employees.
	  	
	 ** profit is derived (i.e. calculated), and does not need a setter. Profit equals revenue minus expenses.
	 
	 */

	//
	// Write your code below
	//
	private int name;
	private int numberOfEmployees;
	private int revenue;
	private int expenses;
	private int companySize;
	private int profit;
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	public int getExpenses() {
		return expenses;
	}
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	public void isProfit(int profit){
	    profit = revenue - expenses;
	}
	public void isCompanySize(String companySize) {
		if (numberOfEmployees < 50){
			 companySize = "small";
		} else if (numberOfEmployees > 250) {
			companySize = "large";
		}else {
			companySize = "medium";
		}
	}
	

}
