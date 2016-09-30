package com.techelevator;

//import java.io.FileInputStream;
//import java.util.Properties;

public class BankCustomer {
	private  String address;
	private String phone;
	private BankAccount accountNumber;
	private String accountHolderName;

	public BankCustomer(String address, String phone, BankAccount accountNumber, String accountHolderName) {
		//super();
		this.address = address;
		this.address = phone;
		this.accountHolderName = accountHolderName;
	}
	public  String getAddress() {
		return address;
	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
	public  String getPhone() {
		return phone;
	}
//	public void setPhone(String phone) {
//		this.address = phone;
//	}
	public String getName(String accountHolderName) {
		return accountHolderName;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	//public static BankCustomer getAddress(BankCustomer address) {
	public BankAccount getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(BankAccount accountNumber) {
		this.accountNumber = accountNumber;
	}
	
		//return null;
	//}
	
}
