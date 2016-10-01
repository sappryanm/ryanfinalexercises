package com.techelevator;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
	BankCustomer customer;
	BankAccount ourBankAccount2;
	Checking customerWithNeg100;
	@Before
	public void setUp()  {
		customer = new BankCustomer("address 5433", "31784844008", "Bob Smith" );
		ourBankAccount2 = new BankAccount(customer, "00123Checking");
		customerWithNeg100 = new Checking(customer, "00035");
	}

	@Test
	public void test_DollarAmoun_Withdrawl_Checking() {
		Checking customerWith0 = new Checking(customer, "01");
		BankAccount customerWithZeroBankAccount = new BankAccount(customer, "01");
		BankCustomer customer3 = new BankCustomer("address 54323", "317848440028", "poor" );
		DollarAmount withDrawalAmount= new DollarAmount(-1000);

		String withdrawal = customerWith0.withdrawal(withDrawalAmount).toString();
		Assert.assertEquals("$10.00", customerWith0.getBalance().toString());
	}
//	Withdraw more money than is in the account, but not more than $100 more.
//	Check the new balance is the expected negative number with the overdraw fee.
	@Test
	public void test_DollarAmoun_Withdrawl_Checking2() {
		DollarAmount balance = new DollarAmount(9000);
		DollarAmount amountToWithDrawal = new DollarAmount(-10000);
		String withdrawal = customerWithNeg100.withdrawal(balance).toString();
		Assert.assertEquals("$-100.00", withdrawal);
	}
	@Test
	public void test_DollarAmoun_Withdrawl_will_leave_account_withNegative100_and_not_goThroough() {
		DollarAmount balance = new DollarAmount(100000);
		String withdrawal = customerWithNeg100.withdrawal(balance).toString();
		Assert.assertEquals("$0.00", withdrawal);
		
	}

}
