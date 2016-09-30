package com.techelevator;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankCustomer customer;
	BankAccount ourBankAccount;
	@Before
	public void setUp() {
		customer = new BankCustomer("address 5433", "31784844008", "Bob Smith" );
		ourBankAccount = new BankAccount(customer, "00123");
	
	}

	@Test
	public void DollarAmount_balance_test() {
	DollarAmount balance = new DollarAmount(10000);
	int oneHundred = balance.getDollars();
	//ourBankAccount.getBalance();
	Assert.assertEquals(100, oneHundred);
	}
	
@Test
public void  Deposit_Test() {
	DollarAmount balance = new DollarAmount(10000);
	//int deposit = ourBankAccount.plus(new DollarAmount(2500));
//	DollarAmount deposit = ourBankAccount.plus(new DollarAmount (100));
	String deposit = (ourBankAccount.deposit(balance)).toString();
	//int onehundred25 = balance.getDollars();
	Assert.assertEquals("$100.0", deposit);
}
@Test
public void  withdrawlTest() {
	DollarAmount balance = new DollarAmount(10000);
	
	//DollarAmount deposit = balance.plus(new DollarAmount(2500));
	String withdrawal = (ourBankAccount.withdrawal(balance)).toString();
	//int onehundred25 = balance.getDollars();
	Assert.assertEquals("$-100.0", withdrawal);
}
@Test
public void  transferTest() {
	DollarAmount balance = new DollarAmount(10000);
	//BankCustomer myCustomer = new BankCustomer("address 5433", "3178484008", "Bob Smith");
	BankAccount destination = new BankAccount(customer, "00125");
	//DollarAmount deposit = balance.plus(new DollarAmount(2500));
	ourBankAccount.transfer(destination, balance);
	//int onehundred25 = balance.getDollars();
	Assert.assertEquals("$-100.0", ourBankAccount.getBalance().toString());
	Assert.assertEquals("$100.0", destination.getBalance().toString());
}
}
