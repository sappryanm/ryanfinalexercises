package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	BankCustomer accountHolder; 
	String accountNumber;
	//
//	String addresss;


	protected DollarAmount balance;
	//this is the constructor
	public BankAccount (BankCustomer accountHolder, String accountNumber) {
	   // this.accountHolderName = BankCustomer.getAddress(accountHolderName);
		
		this.accountNumber = accountNumber;
	    this.balance = new DollarAmount(0);
	    //this.accounts =  new ArrayList<BankAccount>();
	    //account starts at zero dollars        
	    accountHolder.addAccount(this);
	}

	
	

//		BankCustomer accountHolderName ="John";
		
	

	public DollarAmount getBalance() {
	    return balance;
	}
	//first method
	//DollarAmount getBalance()
	//This method returns the current balance.
//	public String getname(BankAccount accountHolderName) {
		//BankCustomer customerName = BankCustomer.setName(null);
//		return accountHolderName;
//	}
//	public BankCustomer getphone(BankCustomer phone) {
//		BankCustomer phoneNumber = BankCustomer.getPhone();
//		return phoneNumber;
//	}
//	public BankCustomer getAddresss(BankCustomer addresss) {
//		BankCustomer address = BankCustomer.getAddress();
//		return address;
//	}

	public DollarAmount deposit(DollarAmount amountToDeposit) {
	    balance = balance.plus(amountToDeposit);
	    return balance;
	}

	//*DollarAmount deposit(DollarAmount amountToDeposit)
	//This method adds amountToDeposit to the current balance, and returns the new balance.

	public DollarAmount withdrawal(DollarAmount amountToWithdrawl) {
	    balance = balance.minus(amountToWithdrawl);
	    return balance;
	}
	//DollarAmount withdraw(DollarAmount amountToWithdraw)
	//This method subtracts amountToWithdraw from the current balance, and returns the new balance.

	public void transfer(BankAccount destinationAccount, DollarAmount transferAmount) {
	    this.withdrawal(transferAmount);
	    destinationAccount.deposit(transferAmount);
	    
	  
	}
	//public void fee(DollarAmount feeAmount) {
	  //  this.withdrawal(feeAmount);
	//}

	

	}
	    
	//void transfer(BankAccount destinationAccount, DollarAmount transferAmount)
	//This method withdraws transferAmount from this account, and deposits the same amount in destinationAccount.*/
