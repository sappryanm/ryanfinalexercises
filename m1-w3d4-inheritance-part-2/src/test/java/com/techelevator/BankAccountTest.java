package com.techelevator;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount ourBankAccount;
	@Before
	public void setUp() {
		ourBankAccount = new BankAccount("Ryan", "00123");
	}

	@Test
	public void get_balance_test() {
	DollarAmount balance = new DollarAmount(10000);
	int oneHundred = balance.getDollars();
	ourBankAccount.getBalance();
	Assert.assertEquals(100, oneHundred);
	}
	

}
