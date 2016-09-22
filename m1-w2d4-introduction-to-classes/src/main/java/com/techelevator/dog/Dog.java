package com.techelevator.dog;

/**
 * This class represents a dog that can sleep, wake, and make a sound, so it's pretty much like most dogs,
 * with a few essential methods missing. Thankfully.
 */
public class Dog {

	
	//public static final String isSleeping = null;
	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//

	//private boolean wakeDogUp;
	//private boolean awake;
	//private String name;
	//
    public String noise;
    private boolean awake;

    public Dog() {
        awake = true;
        noise = "woof!";
    }

    /**
     * @return "woof!" if the dog is awake, otherwise "Zzzz..."
     */
    public String makeSound() {
        if (awake) {
            return noise;
        } else {
            return "Zzzz...";
        }
    }

    public void sleep() {
        this.awake = false;
    }

    public void wakeUp() {
        this.awake = true;

    }

    /**
     * @return true if the dog is sleeping, otherwise false
     */
    public boolean isSleeping() {
        return !awake;
    }
}
