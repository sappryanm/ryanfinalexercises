package com.techelevator.person;

public class PersonTest {

		public static void main(String[] args) {
		    
		    // write code here that verifies the functionality of the Person class
		    

		            
		            boolean allTestsPassed = true;
		            
		            /*** Test should pass if a person object has been initialized. ***/
		            Person newPerson = new Person("Ryan", "Sapp", "RyanSapp", 42, true);
		            if(newPerson.getFirstname() == null) {
		                allTestsPassed = false;
		                System.out.println("Test FAILED: The result should display first name of a person.");
		            }
		            
		           
		            Person secondPerson = new Person ("Freedy", "Sapp", "FreddySapp", 17, false);
		            if(secondPerson.getFirstname() == null) {
		                allTestsPassed = false;
		                System.out.println("Test FAILED: The result should have displayed the last Name of a person.");
		            }
		            
		            int diffAge = 17;
		            if(diffAge == newPerson.getAge()) {
		                allTestsPassed = false;
		                System.out.println("Test FAILED: The returned result should be the same as the age variable.");
		            
		            
		          
		                    
		            

		    }if(allTestsPassed) {
		        System.out.println("All tests PASSED!");
		    }
		    
		    }
		  
		    
		}
