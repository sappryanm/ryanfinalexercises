package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ElevatorTEst {
	
	private Elevator ourElevator;
	
	@Before
	public void setup() {
	ourElevator = new Elevator(3, 10);
	}
	
	@Test
	public void intialize_values_are_stores_correctly() {
		
		
		int shaftNumber = ourElevator.getShaftNumber();
		int levelElevator = ourElevator.getNumberOfLevels();
		int currentLevelElevator = ourElevator.getCurrentLevel();
		boolean successDoorOpen = ourElevator.isDoorOpen();
		boolean successMoving = ourElevator.isMoving();
		Assert.assertEquals(3, shaftNumber);
		Assert.assertEquals(10, levelElevator);
		Assert.assertEquals(1, currentLevelElevator);
		Assert.assertTrue(successDoorOpen);
		Assert.assertFalse(successMoving);
	}


	
//	public void test_open_doors() {
		//int firstClassSeats = ourPlane.getAvailableFirstClassSeats();
//		Elevator ourElevator5 = new Elevator(3, 4, 4, true, false );
	//		ourElevator.OpenDoor()
	
//			boolean OpenDoor = (ourElevator5.isMoving() == false || ourElevator.isDoorOpen() == false);
//		Assert.assertTrue("We  can open door while not moving", OpenDoor);
		//Assert.assertSame(!moving, OpenDoor);
		
	
	@Test
	public void test_open_doors_2() {
		
		Elevator ourElevator5 = new Elevator(3, 4, 4, true, false );
			boolean OpenDoor = (ourElevator5.isMoving() == true) ;
			boolean OpenDoor2 = (ourElevator5.isDoorOpen() == true) ;
			//boolean OpenDoor3 = (ourElevator5.isMoving() == false && ourElevator.isDoorOpen() == false);
		Assert.assertFalse("We  can not open door while moving", OpenDoor);
		Assert.assertTrue("We  can not open door when already opened", OpenDoor2);

	}
	@Test
	public void testing_going_up() {
		//ourElevator = new Elevator(1, 2, 5, true, false );
		//boolean success = ourElevator.OpenDoor();
		//if(ourElevator.isMoving() == false && ourElevator.isDoorOpen() == false)
	//boolean success =  ourElevator.isDoorOpen() == false && ourElevator.isMoving() == false;
	//boolean success = ourElevator.GoUp(2) + ourElevator.getCurrentLevel();
		//Assert.assertEquals(5, success);
		//int upDesiredFloor= ourElevator.getCurrentLevel();
		//Assert.assertEquals(2, downDesiredFloor);
		boolean success = ourElevator.GoUp(2);
		Assert.assertTrue("We  can go up", success);
	}
		@Test
		public void open_door_check_go_down(){
			Elevator ourElevator6 = new Elevator(3, 10, 4, false, true);
		ourElevator6.GoUp(1);
		boolean down = ourElevator6.GoDown(1);
		Assert.assertFalse("Elevator went down while door was open", down);             	
	}
	@Test
	public void testing_going_up_not_enough_floors() {
	Elevator elevatorTest2 = new Elevator( 2, 5, 3, true, false);
	boolean success = elevatorTest2.GoUp(2);
	Assert.assertFalse("We  can not go up", success);
	
	
}
	@Test
	public void testing_going_down_not_enoguh_floors() {
		Elevator ourElevator2 = new Elevator(1, 2, 10, false, false );
		boolean success = ourElevator2.GoDown(2) ;
		Assert.assertFalse("We  can go not go down", success);
	}
	@Test
	public void testing_going_down() {
		Elevator ourElevator3 = new Elevator(4, 5, 10, false, false );
		boolean success = ourElevator3.GoDown(2) ;
		Assert.assertTrue("We  can go go down", success);
		
	}
	@Test
	public void testing_going_down_door_condtitions() {
		Elevator ourElevator3 = new Elevator(4, 5, 10, true, true);
		boolean success = ourElevator3.GoDown(2) ;
		Assert.assertFalse("We  can not go go down with door open and moving", success);	
	}
	@Test
	public void testing_going_down_door_condtitions_moving() {
		Elevator ourElevator3 = new Elevator(4, 1, 10, false, true);
		boolean success = ourElevator3.GoDown(2) ;
		Assert.assertFalse("We  can not go go down with door open and moving", success);	
	}
	public void testing_going_down_door_condtitions_moving_null() {
		Elevator ourElevator3 = new Elevator(4, 1, 10, false, true);
		boolean success = ourElevator3.GoDown(2) ;
		Assert.assertFalse("We  can not go go down with door open and moving", success);	
	}
	
	            @Test
	            public void getters_setters_test(){
	            /*** Test should pass if a person object has been initialized. ***/
	            Elevator elevatorTest = new Elevator( 3, 2, 5, true, false);
	            //if(planeTest.getPlaneNumber() == null) {
	               // allTestsPassed = false;
	        
	            int successShaftNumber = elevatorTest.getShaftNumber();
	            Assert.assertEquals(3, successShaftNumber);
	            int successCurrentLevel = elevatorTest.getCurrentLevel();
	            Assert.assertEquals(2, successCurrentLevel);
	            int successNumberOfLevels = elevatorTest.getNumberOfLevels();
	            Assert.assertEquals(5, successNumberOfLevels);
	            boolean successDoorOpen = elevatorTest.isDoorOpen();
	            Assert.assertTrue("Doors Open", successDoorOpen);
	            boolean successMoving = elevatorTest.isMoving();
	            Assert.assertFalse("Doors Closed and Moving", successMoving);
	                
	            }
	            
}