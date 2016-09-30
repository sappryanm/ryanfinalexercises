package com.techelevator;

import java.io.FileInputStream;
import java.util.Properties;

public class BankCustomer extends BankAccount{
	private int address;
	
	public BankCustomer (String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		this.balance = new DollarAmount(0);
		
	// create and load default properties
	Properties defaultProps = new Properties();
	FileInputStream in = new FileInputStream("defaultProperties");
	defaultProps.load(in);
	in.close();

	// create application properties with default
	Properties applicationProps = new Properties(defaultProps);

	// now load properties 
	// from last invocation
	in = new FileInputStream("appProperties");
	applicationProps.load(in);
	in.close();
	
	}
	/*
	FileOutputStream out = new FileOutputStream("appProperties");
	applicationProps.store(out, "---No Comment---");
	out.close();
	
	https://docs.oracle.com/javase/tutorial/essential/environment/properties.html
	*/
	
	/*Create a new class.
	1) BANKCUSTOMER
	BankCustomer represent a bank customer.
	Attributes / Properties
	name<br/> address<br/> phone number<br/>
	Exercise
	Remove the accountHolderName attribute/property
	 from the BankAccount class and replaced with an attribute
	  that stores a reference to a BankCustomer object.
	Write unit tests to verify the functionality of your code.
	*/
}
