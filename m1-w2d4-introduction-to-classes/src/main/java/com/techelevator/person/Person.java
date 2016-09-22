package com.techelevator.person;

public class Person {

	/*
	 
	 The Person class has the following properties
	 	firstName
		lastName
		fullName * 
		age
	 	adult **
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * fullName is derived (i.e. calculated), and does not need a setter.
	  
	 ** adult is derived (i.e. calculated), and does not need a setter. Any person whose age is 18 or greater is an adult.
	 
	 */

	//
	// Write your code below
	//
	private String firstname;
	private String lastname;
	private String fullname;
	private int age;
	
	public Person() {
		firstname = "John";
		lastname = "Doe";
		fullname = getFullname();
		age = 0;
		
	}
	
	public boolean adult() {
		if(age >= 18)
			return true;
		return false;
	}
	public void fullname(String fullname) {
		this.fullname = getFirstname() + getLastname();
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFullname() {
		return fullname;
	}
	//public void setFullname(String fullname) {
		//this.fullname = fullname;
	//}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
