package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SmartPhoneTest {

	@Before
	public void setUp() {
	}

	public static void main(String[] args) {
		SmartPHone myPhone = new SmartPhone(); 
		myPhone.displayMessage();
		myPhone.PhoneMaker();
		myPhone.phoneSpecs();
		System.out.println("test");

}
	@Test
	public void SmartPhone_test() { 
		assert 'dialing 555-1234' == sp.dial('555-1234') 
				}
}
