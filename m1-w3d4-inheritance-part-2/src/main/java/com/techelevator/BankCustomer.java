package com.techelevator;

//import java.io.FileInputStream;
//import java.util.Properties;

public class BankCustomer {
	private static String address;
	private String phone;
	private static String name;

	
	public BankCustomer(BankCustomer address, BankCustomer phone, BankCustomer name) {
		//super();
		this.address = address;
		this.address = phone;
		this.name = name;
	}
	public static BankCustomer getAddress() {
		return address;
	}
	public void setAddress(BankCustomer address) {
		this.address = address;
	}
	public static BankCustomer getPhone() {
		return getPhone();
	}
	public void setPhone(BankCustomer phone) {
		this.address = phone;
	}
	public static BankCustomer getName(BankCustomer fullName) {
		return name;
	}
	public void setName(BankCustomer name) {
		this.name = name;
	}
	public static BankCustomer getAddress(BankCustomer address) {
	
		return null;
	}
	
}
