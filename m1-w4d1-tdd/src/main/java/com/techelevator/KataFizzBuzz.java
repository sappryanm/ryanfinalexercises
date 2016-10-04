package com.techelevator;


import java.util.List;

public class KataFizzBuzz {


	public String kata(int number) {
		if (number % 3 == 0 && number % 5 == 0 && number !=0) {
	           return "FizzBuzz";
	       }
	       if (number % 3 == 0 && number !=0) {
	           return "Fizz";
	       }
	       if (number % 5 == 0 && number !=0) {
	           return "Buzz";
	       }
	       return String.valueOf(number);
		   }
	
}
	
