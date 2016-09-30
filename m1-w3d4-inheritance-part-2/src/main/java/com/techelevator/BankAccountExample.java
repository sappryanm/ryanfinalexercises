package com.techelevator;

public class BankAccountExample {


		
		    public static void main(String[] args) {
		    	//this.balance = new DollarAmount(0);
		       
		    	
		        SavingsAccount mySavings = new SavingsAccount("Ryan", "00235");
		        Checking myChecking = new Checking("Ryan","00543");

		       
		        mySavings.deposit(new DollarAmount(120000));
		        myChecking.deposit(new DollarAmount(12000000));
		     
		        mySavings.transfer(new BankAccount(("00235"),("00543")), new DollarAmount(20000));
		       // myChecking.withdrawal(this.balance = balance.minus(amountToWithdrawl));
		        myChecking.withdrawal(new DollarAmount(100000));

		        /*
		         * Transfer and withdraw some more.
		         */
		        mySavings.transfer(new BankAccount(("Ryan"), ("00235")), new DollarAmount(1300));
		        myChecking.withdrawal(new DollarAmount(10000000));

		  

		        /*
		         * Print some results.
		         */
		        System.out.println();
		        System.out.println("My savings balance: "
		              + mySavings.getBalance());
		        System.out.println("Expected:              1200.00");
		        System.out.println();

		        System.out.println("My checking balance: "
		              + myChecking.getBalance());
		        System.out.println("Expected:                 12000.0");

	}
	
}
