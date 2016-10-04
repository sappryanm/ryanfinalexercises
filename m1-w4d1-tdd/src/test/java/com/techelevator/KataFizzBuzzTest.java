package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KataFizzBuzzTest {
//	Test Cases
//	What happens if 0 is passed in?
//	What happens if 101 is passed in?
//	What test cases can we come up with for the core FizzBuzz exercise?
//	Step 2
//	A number is fizz if it is divisible by 3 or it has a 3 in it
//	A number is buzz if it is divisible by 5 or it has a 5 in it
	
		private KataFizzBuzz FizzBuzz;
		
	@Before
	public void setup() {
	FizzBuzz = new KataFizzBuzz();
	//FizzBuzzList = new ArrayList<String>();
	}
	@Test
	public void returnsNumber() {
	       assertEquals("0", FizzBuzz.kata(0));
	   }
	   @Test
	   public void returnsNumber101(){
	       assertEquals("101", FizzBuzz.kata(101));

	   }
	 
	   @Test
	   public void returnsFizzWhenNumberIsMultipleOfThree() {
	       assertEquals("Fizz", FizzBuzz.kata(3));
	   }
	   @Test
	   public void returnsBuzzWhenNumberIsMultipleOfFive() {
	       assertEquals("Buzz", FizzBuzz.kata(5));
	   }

	   @Test public void
	   returnsFizzBuzzWhenNumberIsMultipleOfThreeAndFive()  {
	       assertEquals("FizzBuzz", FizzBuzz.kata(15));
	   }
	    
}



