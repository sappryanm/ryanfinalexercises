package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SmartPhoneTest {
	
	private SmartPhone smartphone;
	
	@Before
	public void setUp() {
		smartphone = new SmartPhone("3178484008", "Verizion");
	}

	
	@Test
	public void initialization_values_are_stored_correctrly(){

	String phoneNumber = smartphone.getPhoneNumber();
	String carrierInt = smartphone.getCarrier();
	String operatingSystem = smartphone.getOperatingSystem();
	Boolean onCall = smartphone.isOnCall();
	int batteryCharge = smartphone.getBatteryCharge();
	smartphone.setOperatingSystem("Android");

	Assert.assertEquals("3178484008", phoneNumber);
	Assert.assertEquals("Verizion", carrierInt);
	Assert.assertEquals("android", operatingSystem);
	Assert.assertFalse("New are not on call", onCall);
	Assert.assertEquals(100, batteryCharge);
	
	}
	@Test
	public void test_call(){
		smartphone.AnswerPhone();
		boolean success = smartphone.Call("3175070048", 5);
		int batteryCharge = smartphone.getBatteryCharge();

		Assert.assertTrue("Elevator did not go up", success);
		Assert.assertEquals(95,  batteryCharge);
		
	}
	@Test
	public void test_recharge(){
		smartphone.AnswerPhone();
		//smartphone.HangUp();
		
		boolean success = smartphone.Call("3175070048", 100);
		int batteryCharge = smartphone.getBatteryCharge();

		Assert.assertTrue("Elevator did not go up", success);
		Assert.assertEquals(0,  batteryCharge);
		smartphone.HangUp();
		smartphone.RechargeBattery();
	}
	@Test
	public void test_Haning_up(){
		
		//smartphone.HangUp();
		smartphone.HangUp();
		//boolean success = smartphone.Call("3175070048", 100);
		int batteryCharge = smartphone.getBatteryCharge();

		//Assert.assertTrue("Elevator did not go up", success);
		Assert.assertEquals(100,  batteryCharge);

	}
	/*
	@Test
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
				*/
}
