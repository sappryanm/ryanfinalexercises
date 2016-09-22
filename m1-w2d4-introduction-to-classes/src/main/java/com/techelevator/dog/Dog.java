package com.techelevator.dog;

/**
 * This class represents a dog that can sleep, wake, and make a sound, so it's pretty much like most dogs,
 * with a few essential methods missing. Thankfully.
 */
public class Dog {

	public static final String isSleeping = null;
	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//
	public boolean sleep;
	public boolean noise;
	public boolean wakeUP;
	
	public String Dog() {
		boolean wakeUP;
	}
	
	/**
	 * @return "woof!" if the dog is awake, otherwise "Zzzz..."
	 */
	public String makeSound(Boolean noise) {
	 
		
	if ((sleep) && (noise)){
		return "woof";
		}else {
		return "Zzzz...";
	}
	}
	
	/**
	 * Puts the dog to sleep
	 * @param sleep 
	 */
	public void sleep(boolean putToSleep) {
		putToSleep = isSleeping(true);
			
	}
	
	/**
	 * Wakes the dog up
	 * @param wakeUP 
	 */
	public void wakeUp(boolean wakeUP) {
		wakeUP = isSleeping(false);
			
	}
	
	/**
	 * @return true if the dog is sleeping, otherwise false
	 */
	public boolean isSleeping(boolean isSleeping) {
		return isSleeping;
	}
}
