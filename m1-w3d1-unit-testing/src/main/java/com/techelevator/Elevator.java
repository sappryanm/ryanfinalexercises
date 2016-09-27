package com.techelevator;

public class Elevator {

	private int shaftNumber;
    private int currentLevel;
    private int numberOfLevels;
    private boolean doorOpen;
    private boolean moving;

    /**
     * Creates a new elevator 
     * @param shaftNumber Shaft for the elevator
     * @param totalNumberOfFloors Number of floors in the elevator
     */
    public Elevator(int shaftNumber, int totalNumberOfFloors) {
        this.shaftNumber = shaftNumber;
        this.numberOfLevels = totalNumberOfFloors;
        this.currentLevel = 1;
        this.doorOpen = true;
        this.moving = false;

    }

    public Elevator(int shaftNumber, int currentLevel, int numberOfLevels, boolean doorOpen, boolean moving) {
		super();
		this.shaftNumber = shaftNumber;
		this.currentLevel = currentLevel;
		this.numberOfLevels = numberOfLevels;
		this.doorOpen = doorOpen;
		this.moving = moving;
	}

	/**
     * Elevator Shaft Number 
     * @return shaftNumber
     */
    public int getShaftNumber() {
        return shaftNumber;
    }

    /**
     * Current elevator level 
     * @return currentLevel
     */
    public int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Number of levels available for elevator. 
     * @return numberOfLevels
     */
    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    /**
     * Is Elevator Door Open? 
     * @return doorOpen
     */
    public boolean isDoorOpen() {
        return doorOpen;
    }

    /**
     * Is elevator door moving 
     * @return moving
     */
    public boolean isMoving() {
        return moving;
    }

    /**
     * Opens the elevator door, as long as it is not moving 
     */
   // public void OpenDoor()
   // {
   //     this.doorOpen = !moving; 
   // }

    /**
     * Closes the elevator door, as long as it is not moving. 
     */
   // public void CloseDoor()
    {
    	//this.doorOpen = !moving && !doorOpen;
        
    }

    /**
     * Moves the elevator up, as long as the door is closed and the desired floor is not past the last floor 
     * @param desiredFloor Desired floor to go to
     * @return If the elevator was able to move up
     */
    public boolean GoUp(int desiredFloor)
    {
//        currentLevel = desiredFloor;

        if (desiredFloor > currentLevel && desiredFloor <= numberOfLevels && !moving)
        {
        	currentLevel = desiredFloor;
        	return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Moves the elevator down, as long as the door is closed and desired floor is lower than current but not past 1 
     * @param desiredFloor Floor to go to
     * @return True if possible to move
     */
    public boolean GoDown(int desiredFloor)
    {
      //  if (!doorOpen && desiredFloor < currentLevel && desiredFloor > 0)
    	if (desiredFloor < currentLevel && desiredFloor > 0 && !moving)
        {
//           currentLevel -= desiredFloor;
       	this.currentLevel = currentLevel - desiredFloor;
            return true;
        }

        return false;
    }

}
