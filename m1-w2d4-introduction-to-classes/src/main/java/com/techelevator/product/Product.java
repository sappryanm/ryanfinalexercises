package com.techelevator.product;

public class Product {

	/*
	 
	 The Product class has the following properties
	 	name
	 	price
	 	weightInOunces
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in ProductTest.java to verify the functionality of the Product class.  
	 (Please see notes in ProductTest.java for further instructions.)
	 
	 */

	//
	// Write your code below
	//
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}



    public String getName() {
    	return name;
    	}
    public double getPrice() {
    	return price;
    	}
    public String toString() {
    	return name + ": $"+price;
    	}
    public double weight() {
		return weight;
    	
    }
	
}
