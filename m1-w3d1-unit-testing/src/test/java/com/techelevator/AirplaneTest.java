package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class AirplaneTest {
	
	private Airplane ourPlane;
	
	@Before
	public void setup() {
	ourPlane = new Airplane(13, 150);
	}
	
	@Test
	public void intialize_values_are_stores_correctly() {
		
		
		int firstClassSeats = ourPlane.getAvailableFirstClassSeats();
		int coachSeats = ourPlane.getAvailableCoachSeats();
		
		Assert.assertEquals(13, firstClassSeats);
		Assert.assertEquals(150, coachSeats);
	}

	@Test
	public void reserve_a_first_class_seat() {
		//int firstClassSeats = ourPlane.getAvailableFirstClassSeats();
		boolean success = ourPlane.reserve(true, 1);
		int firstClassAvailable = ourPlane.getAvailableFirstClassSeats();
		
		Assert.assertTrue("We were able to reserve a First CLass Seat", success);
		Assert.assertEquals(12, firstClassAvailable);
		
	}
	
	@Test
	public void reserving_a_coach_seat() {
		//int firstClassSeats = ourPlane.getAvailableFirstClassSeats();
		boolean success = ourPlane.reserve(false, 1);
		int coachClassAvailable = ourPlane.getAvailableCoachSeats();
		
		Assert.assertTrue("We were not able to reserve a Coach Seat", success);
		Assert.assertEquals(149, coachClassAvailable);
	}
	@Test
	public void resevere_too_many_first_class() {
	boolean success = ourPlane.reserve(true, 15);
	int firstClassAvaliable = ourPlane.getAvailableFirstClassSeats();
	
	Assert.assertFalse("We are able to reserve more first clas seats then Available", success);
	Assert.assertEquals(13, firstClassAvaliable);
	}
	@Test
	public void resevere_too_many_coach_seats() {
	//Boolean success = ourPlane.reserve(false, 150);
		Airplane planeTest2 = new Airplane("53422",13, 10, 150, 150);
	boolean coachAvailable = planeTest2.reserve(false, 150);
	//Boolean success = planeTest2.reserve(false, 150);
	//int firstClassAvaliable = planeTest2.getAvailableCoachSeats();
	
	Assert.assertFalse("We are able to reserve more coach seats then Available", coachAvailable);
	
	}
	//Assert.assertEquals(1, coachAvailable);
	
	//public static void main(String[] args) {
	    
	    // write code here that verifies the functionality of the Person class
	    

	            
	           // boolean allTestsPassed = true;
	            @Test
	            public void getters_setters_test(){
	            /*** Test should pass if a person object has been initialized. ***/
	            Airplane planeTest = new Airplane("53422",13, 10, 150, 149);
	            //if(planeTest.getPlaneNumber() == null) {
	               // allTestsPassed = false;
	            String success = planeTest.getPlaneNumber();
	            Assert.assertEquals("53422", success);
	            int successTotalFirstClass = planeTest.getTotalFirstClassSeats();
	            Assert.assertEquals(13, successTotalFirstClass);
	            int successBookedFirstClass = planeTest.getBookedFirstClassSeats();
	            Assert.assertEquals(10, successBookedFirstClass);
	            int successTotalCoachSeats = planeTest.getTotalCoachSeats();
	            Assert.assertEquals(150, successTotalCoachSeats);
	            int successBookedCoachSeats = planeTest.getBookedCoachSeats();
	            Assert.assertEquals(149, successBookedCoachSeats);
	                
	            }
	            
	           
//	            Airplane planTotalFirstClass = new Airplane("5342",13, 10, 150, 149);
//	            boolean success = planeTest.getPlaneNumber() == null);
//	            Assert.assertTrue("Test no plane Number", allTestsPassed);
	            
//	            if(allTestsPassed) {
//	    			System.out.println("All tests PASSED!");
	    		
}

