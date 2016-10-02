package com.techelevator;



import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {
	BankCustomer customerVIP;
	BankAccount ourBankAccountVIP;
	Checking customerWith25k;
	
	//BankCustomer List<BankAccount> accounts;
	@Before
	public void setUp()  {
		//Customer With Amount Larger then 350
		customerVIP = new BankCustomer("address 5433", "31784844008", "VIP" );
		ourBankAccountVIP = new BankAccount(customerVIP, "100");
		customerWith25k = new Checking(customerVIP, "c36");

	}
	@Test
	public void test_Savings_over_150() {
		 DollarAmount startingBalance = new DollarAmount(4500000);
		 DollarAmount balanceOf450000 = customerWith25k.deposit(startingBalance);
		 SavingsAccount customerVIP1withNoSavings = new SavingsAccount(customerVIP, "s06");
		//String withdrawal = customerWith25k.withdrawal(amountToWithDrawal).toString();
		boolean VIP = customerVIP.isVip();
		
		 Assert.assertTrue("This should return customer  VIP is VIP", VIP);
	}

	@Test
	public void test_Savings_lessthan25k() {
		 DollarAmount startingBalance = new DollarAmount(24000);
		 DollarAmount balanceOf24000 = customerWith25k.deposit(startingBalance);
		 SavingsAccount customerVIP1withNoSavings = new SavingsAccount(customerVIP, "s06");
		boolean VIP = customerVIP.isVip();	
		 Assert.assertFalse("This should return customer  VIP is VIP", VIP);
	}
//	Withdraw more money than is in the account, but not more than $100 more.
//	Check the new balance is the expected negative number with the overdraw fee.
	@Test
	public void test_getters() {
		String address = customerVIP.getAddress();
		String phone =customerVIP.getPhone();
		String name = customerVIP.getName();
		
		Assert.assertEquals("address 5433", address);
		Assert.assertEquals("31784844008", phone);
		Assert.assertEquals("VIP", name);
	}
	@Test
	public void Test_RemoveAccount_andList(){
	
	List<BankAccount> VipTest = customerVIP.getAccounts();
	List<BankAccount> VipTest2 = customerVIP.getAccounts();
	//List<BankAccount> VipTest2 = customerVIP.getAccounts();
	BankAccount ourBankAccountVIP2 = new BankAccount(customerVIP, "110");
	//BankCustomer accountTest = customerVIP.removeAccount(ourBankAccountVIP);
	customerVIP.removeAccount(ourBankAccountVIP2);
	Assert.assertArrayEquals(VipTest2.toArray(), VipTest.toArray());
	 //Assert.assertTrue(customerVIP.equals(VipTest);
	}
	/*
	@Test
	public void Test_RemoveAccount(){
	
	BankAccount accountTest = customerVIP.removeAccount(customerWith25k);
	Assert.assertEquals("Unable to get BankAccount List", VipTest);
	}                                  
*/
}
