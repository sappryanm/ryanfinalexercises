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
		ourBankAccount = new BankAccount(customer, "0023");
		
	}
// Checks Deposit and Withdrawal method while doing transfer
@Test
public void  transferTest() {
	DollarAmount balance = new DollarAmount(10000);
	//BankCustomer myCustomer = new BankCustomer("address 5433", "3178484008", "Bob Smith");
	BankAccount destination = new BankAccount(customer, "00125");
	//DollarAmount deposit = balance.plus(new DollarAmount(2500));
	ourBankAccount.transfer(destination, balance);
	//int onehundred25 = balance.getDollars();
	Assert.assertEquals("$-100.00", ourBankAccount.getBalance().toString());
	Assert.assertEquals("$100.00", destination.getBalance().toString());
}
/*
@Test
public void DollarAmount_balance_test() {
DollarAmount balanceTest = new DollarAmount(10000);
//int oneHundred = balanceTest.getDollars();
//ourBankAccount.getBalance();
//String withdrawal = (ourBankAccount.withdrawal(balanceTest)).toString();
Assert.assertEquals(100, ourBankAccount.getBalance().toString());
}

@Test
public void  Deposit_Test() {
BankCustomer  customerD = new BankCustomer("address 543311", "3178484400811", "Bob Smith11" );
BankAccount ourBankAccountD = new BankAccount(customerD, "00043");
DollarAmount currentBalance = new DollarAmount(10000);

DollarAmount depositAmount = new DollarAmount(10000);
String newdeposit = (ourBankAccountD.deposit(depositAmount)).toString();
//int onehundred25 = balance.getDollars();
Assert.assertEquals(newdeposit, ourBankAccountD.getBalance().toString());
}

@Test
public void  withdrawlTest() {

	BankCustomer  customerE = new BankCustomer("address 543311", "3178484400811", "Bob Smith11" );
	BankAccount ourBankAccountE = new BankAccount(customerE, "00043");
	DollarAmount currentBalance = new DollarAmount(10000);
DollarAmount balance = new DollarAmount(10000);

//DollarAmount deposit = balance.plus(new DollarAmount(2500));
String withdrawal = (ourBankAccountE.withdrawal(balance)).toString();
//int onehundred25 = balance.getDollars();
Assert.assertEquals("$-100.00", withdrawal);
}
*/
}
