# Inheritance Pair Exercises

## Bank Teller Application

This is a two day set of exercises. Parts I and II are to be completed on the Day One. Parts III and IV should be finished on Day Two.

### Day One

### Part I

#### DollarAmount

The DollarAmount class is included in the project provided for this exercise. 

The DollarAmount represents an amount of currency in US Dollars. It is meant to be used in place of primitive floating point types in order to represent monetary amounts accurately.

This class is immutable, meaning that no method should change the internal state of an object.

##### Methods

int getCents()

    This method returns the fractional cents for a dollar amount value. Example: the getCents() method of a DollarAmount object that represents $1.23 would return 23.
        
int getDollars()

    This method returns the number of whole dollars. Example: the getDollars() method of a DollarAmount object that represents $3.45 would return 3.
    
DollarAmount plus(DollarAmount amountToAdd)
    
    This method adds the value of "this" DollarAmount object to amountToAdd and returns the sum as a new DollarAmount object.
    
DollarAmount minus(DollarAmount amountToSubtract)

    This method subtracts the value of the amountToSubtract from "this" DollarAmount object and returns the difference as a new DollarAmount object.
    
##### Exercise
     
Override the inherited implementation of the toString method of the DollarAmount class included in the project provided for this exercise.

Example output of the overridden toString method:

```
new DollarAmount(3210).toString()  →  “$32.10”
new DollarAmount(1000).toString() → “$10.00”
new DollarAmount(1).toString() → “$0.01”
```

Write unit tests to verify the functionality of your code.

### Part II

##### Exercise

Create three new classes.

#### 1) BankAccount  

The BankAccount class represents a simple checking or savings account at a bank. The balance is represented in USD using the DollarAmount type.

##### Attributes / Properties

String accountHolderName <br/>
String accountNumber<br/>
DollarAmount balance<br/>

##### Methods
    
DollarAmount getBalance()

    This method returns the current balance.
    
DollarAmount deposit(DollarAmount amountToDeposit)

    This method adds amountToDeposit to the current balance, and returns the new balance.
    
DollarAmount withdraw(DollarAmount amountToWithdraw)

    This method subtracts amountToWithdraw from the current balance, and returns the new balance.

void transfer(BankAccount destinationAccount, DollarAmount transferAmount)

    This method withdraws transferAmount from this account, and deposits the same amount in destinationAccount.

##### 2) CheckingAccount
CheckingAccount has all of the same behavior of the BankAccount class you just created, plus the following additional rules:

1. The CheckingAccount class allows the balance to fall below $0.00, but when this happens a $10.00 overdraft fee is withdrawn from the account.  

2. A CheckingAccount may not be more than $100.00 overdrawn.  If a withdrawal is requested that would leave the account more than $100.00 overdrawn, the withdrawal fails and the balance remains the same. (Hint: Remember to consider fees when calculating how much the account will be overdrawn)

##### 3) SavingsAccount

SavingsAccount has all of the same behavior of the BankAccount class you just created, plus the following additional rules:

1. Every time a withdrawal is made from a SavingsAccount when the current balance is less than $150.00, an additional $2.00 service charge is withdrawn from the account.

2. The SavingsAccount class does not allow a negative balance.  If a withdrawal is requested for more than the current balance, the withdrawal fails and the balance remains the same.  (Hint: Remember to consider fees when calculating whether the account will be overdrawn)

Use class inheritance to avoid code duplication.

Write unit tests to verify the functionality of your code.

### Day Two

This is the Day Two continuation of the Bank Teller Application exercise.

### Part III

##### Exercise

Create a new class.

#### 1) BankCustomer  

BankCustomer represent a bank customer.

##### Attributes / Properties

name<br/>
address<br/>
phone number<br/>

##### Exercise

Remove the accountHolderName attribute/property from the BankAccount class and replaced with an attribute that stores a reference to a BankCustomer object.

Write unit tests to verify the functionality of your code.

### Part IV

##### Exercise

Customers whose combined account balances are at least $25,000 are considered VIP customers and receive special privileges.  

1. Add an isVIP() method to the bank customer object that returns true if the sum of all accounts belonging to that customer is at least $25,000 and false otherwise.

Write unit tests to verify the functionality of your code.
