package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	
    public SavingsAccount(BankCustomer accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	this.balance = new DollarAmount(0);
	
    }
 
    @Override
	public DollarAmount withdrawal(DollarAmount amountToWithdrawl) {
	//	result = testCondition ? value1 : value2
    return	this.balance =((balance.minus(amountToWithdrawl).isGreaterThan(new DollarAmount(0)) &&
		(balance.minus(amountToWithdrawl).isLessThan(new DollarAmount(15000))) ?
				(balance=balance.minus((new DollarAmount(200)))) :
					(balance= balance.minus(new DollarAmount(0)))));
   }
	

	/*
	public void setServiceCharge() {
		DollarAmount newBalance = withdrawal(serviceFee);
		
	}
	*/
	/*
	@Override
	public DollarAmount withdrawal(DollarAmount amountToWithdrawl) { 
	    if((balance.minus(amountToWithdrawl)).isLessThanOrEqualTo(new DollarAmount (0))) { 
	        return balance;
	    }else if (balance.isLessThan(new DollarAmount(15000))) {
	        balance= balance.minus(amountToWithdrawl);
	        balance=balance.minus(new DollarAmount(200));
	        return balance;
	    } else {
	        balance= balance.minus(amountToWithdrawl);
	        return balance; 
	    }

   */
//        int fee= -2
//        deposit(fee);
    
    /*
    SavingsAccount has all of the same behavior of the BankAccount 
    class you just created, plus the following additional rules:
    	Every time a withdrawal is made from a SavingsAccount when the current 
    	balance is less than $150.00, an additional $2.00 
    	service charge is withdrawn from the account.

    	The SavingsAccount class does not allow a negative balance. 
    	If a withdrawal is requested
    	for more than the current balance, the withdrawal
    	fails and the balance remains the same. 
    	(Hint: Remember to consider fees when calculating 
    			whether the account will be overdrawn)
    */
}