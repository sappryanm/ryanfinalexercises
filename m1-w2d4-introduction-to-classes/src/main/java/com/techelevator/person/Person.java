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
	private String firstName;
	private String lastName;
	private String fullName;
	private int age;
	
	public Person() {
//		firstname = "Ryan";
//		lastname = "Sapp";
//		fullname = getFullname();
//		age = 0;
		
	}
	


	public Person(String firstName, String lastName, String fullName, int age, boolean b) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.age = age;
	}



	public boolean adult() {
		if(age >= 18)
			return true;
		return false;
	}
	public void fullname(String fullName) {
		this.fullName = fullName;
	}
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	public String getFullname() {
	this.fullName = firstName + lastName;
		return fullName;
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
