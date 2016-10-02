package com.techelevator;


import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;



public class SavingsAmountTest {
	BankCustomer customerSavings;
	BankAccount ourBankAccount3;
	SavingsAccount customerWith350;
	BankCustomer customerJoe;
	BankAccount ourBankAccount4;
	SavingsAccount customer005 ;
	@Before
	public void setUp()  {
		//Customer With Amount Larger then 350
		customerSavings = new BankCustomer("address 5433", "31784844008", "Bob Smith" );
		ourBankAccount3 = new BankAccount(customerSavings, "00123Savings");
		customerWith350 = new SavingsAccount(customerSavings, "00035");
		
		// Customer With Less then 140
		 customerJoe = new BankCustomer("address 543312", "317848440018", "Joe" );
		 ourBankAccount4 = new BankAccount(customerJoe, "005");
		 customer005 = new SavingsAccount(customerJoe, "005");
		 DollarAmount startingBalance = new DollarAmount(14000);
		 DollarAmount balanceOf140 = customer005.deposit(startingBalance);
	}
	@Test
	public void test_Savings_over_150() {
		 DollarAmount startingBalance = new DollarAmount(35000);
		 DollarAmount balanceOf35000 = customerWith350.deposit(startingBalance);
		DollarAmount amountToWithDrawal = new DollarAmount(10000);
		String withdrawal = customerWith350.withdrawal(amountToWithDrawal).toString();
		Assert.assertEquals("$250.00", withdrawal);
	}

//	Withdraw more money than is in the account, but not more than $100 more.
//	Check the new balance is the expected negative number with the overdraw fee.
	@Test
	public void test_Savings_LessThan_150() {

		DollarAmount amountToWithDrawal = new DollarAmount(10000);
		String withdrawal = customer005.withdrawal(amountToWithDrawal).toString();
		Assert.assertEquals("$38.00", withdrawal);
	}
	@Test
	public void test_will_leave_account_withNegative100_and_not_goThroough() {
		DollarAmount balance = new DollarAmount(100000);
		String withdrawal = customerWith350.withdrawal(balance).toString();
		Assert.assertEquals("$0.00", withdrawal);
		
	}
}
