package com.techelevator;

import  org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class AutoPartsTest {
	private AutoParts testAuto;
	
	@Before
	public void setUp()  {
		testAuto = new AutoParts("Product 1", 14.00, 10.00, 00101.00, "Ford");
	}

	@Test
	public void initialization_values_are_stored_correctrly(){
		
	Double priceTest = AutoParts.getPrice(); 
	//Double weightTest = AutoParts.getWeight();
	//Double patNumberTest = AutoParts.getPartNumber();
	String manufactuererTest = AutoParts.getManufacturer();
	Boolean moving = elevator.isMoving();


	Assert.assertEquals(10, totalLevels);
	Assert.assertEquals(1, currentLevel);
	Assert.assertEquals(3, shaftNum);
	Assert.assertFalse("New elevators are not moving", moving);
	}
}
