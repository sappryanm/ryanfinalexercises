package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	private Television tv;
	@Before
	public void setUp() {
		tv = new Television(true, 5, 3);
	}

	
	@Test
	public void initialization_values_are_stored_correctrly(){
		tv.IsOn();
	Boolean tvOn = tv.IsOn();
	
	int tvSelectedChannel = tv.getSelectedChannel();
	int CurrentVolume = tv.getCurrentVolume();
	
	Assert.assertEquals(5, tvSelectedChannel);
	Assert.assertEquals(3, CurrentVolume);
	Assert.assertEquals(true, tvOn);
	
	}
	@Test
	public void test_channel(){
		tv.TurnOn();
		Boolean tvOn = tv.IsOn();
		tv.ChangeChannel(9);
		int newChannel = tv.getSelectedChannel();
		tv.RaiseVolume();
		int currentVolume = tv.getCurrentVolume();

		Assert.assertTrue("Tv is not on", tvOn);
		Assert.assertEquals(9, newChannel);
		
	}
	@Test
	public void test_channel_outRange2(){
		
		Boolean tvOn = tv.IsOn();
		tv.ChangeChannel(25);
		int newChannel = tv.getSelectedChannel();
		tv.LowerVolume();
		int currentVolume = tv.getCurrentVolume();

		Assert.assertTrue("Tv is off", tvOn);
		Assert.assertNotEquals(25, newChannel);
		
	}
	@Test
	public void test_channel_outRange3(){
		
		Boolean tvOn = tv.IsOn();
		tv.ChangeChannel(1);
		int newChannel = tv.getSelectedChannel();


		Assert.assertTrue("Tv is off", tvOn);
		Assert.assertNotEquals(1, newChannel);
		
	}
	@Test
	public void test_channel_off(){
		tv.TurnOff();
		Boolean tvOn = tv.IsOn();
		tv.ChangeChannel(9);
		//int newChannel = tv.getSelectedChannel();
		

		Assert.assertFalse("Tv is on", tvOn);
		//Assert.assertEquals(9, newChannel);
		
	}
	
	/*
	@Test
	public void test_recharge(){
		tv.AnswerPhone();
		//smartphone.HangUp();
		
		boolean success = tv.Call("3175070048", 100);
		int batteryCharge = tv.getBatteryCharge();

		Assert.assertTrue("Elevator did not go up", success);
		Assert.assertEquals(0,  batteryCharge);
		tv.HangUp();
		tv.RechargeBattery();
	}
	
		
		public void test_channel_outRange(){
		
		Boolean tvOff = tv.IsOn();
	Assert.assertFalse("Tv is off", tvOff);
	tv.TurnOff();
	}
*/
	}
