package com.techelevator;

import java.util.ArrayList;
import java.util.List;

//import java.io.FileInputStream;
//import java.util.Properties;

public class BankCustomer {
	private  String address;
	private String phone;
	List<BankAccount> accounts;
	
	private String name;

	public BankCustomer(String address, String phone, String name) {
		//super();
		this.address = address;
		this.address = phone;
		this.name = name;
		this.accounts =  new ArrayList<BankAccount>();
	}
	public boolean isVip() {
		DollarAmount sum = new DollarAmount(0);
		for(BankAccount account : accounts) {
			sum = sum.plus(account.getBalance());
		}
		if (sum.isGreaterThanOrEqualTo(new DollarAmount (250000))) {
			return true;
		}else {
			return false;
		}
	}
	
	public void addAccount(BankAccount account){
		accounts.add(account);
	
	}	
	public void removeAccount(BankAccount account) {
		accounts.remove(account);
	}
	 public List<BankAccount> getAccounts() {
		 return accounts;
	 }
	 
	 
	public  String getAddress() {
		return address;
	}

	public  String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}

	
		//return null;
	//}
	
}
