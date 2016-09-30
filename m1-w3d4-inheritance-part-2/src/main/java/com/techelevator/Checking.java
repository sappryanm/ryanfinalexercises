package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Checking extends BankAccount {
	//protected DollarAmount fee;
	//private int transactionCount;

	public Checking(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		this.balance = new DollarAmount(0);
	
	   
	    //	result = testCondition ? value1 : value2
	    
	  
	}
	@Override
	    public DollarAmount withdrawal(DollarAmount amountToWithdrawl) {
	   return this.balance = (((balance.minus(amountToWithdrawl)).isLessThanOrEqualTo(new DollarAmount (-10000)) &&
	    	(balance.minus(amountToWithdrawl).isLessThan(new DollarAmount(0)))) ?
	    	(balance = balance.minus(new DollarAmount(1000))) :
	    	(balance = balance.minus(new DollarAmount(0))));
	    	
	    
	    }

	    //
	    // Note that getBalance is not specialized, since it works the same for a
	    // checking account as for a regular bank account.
	    //

	
		
/*	CheckingAccount has all of the same behavior of the BankAccount 
 * class you just created, plus the following additional rules:
		The CheckingAccount class allows the balance to fall
		 below $0.00, but when this happens a $10.00 overdraft 
		 fee is withdrawn from the account.

		A CheckingAccount may not be more than $100.00 overdrawn. 
		If a withdrawal is requested that would leave the account 
		more than $100.00 overdrawn, the withdrawal fails and the
		 balance remains the same. (Hint: Remember to consider fees 
		 when calculating how much the account will be overdrawn)
*/

	

}
