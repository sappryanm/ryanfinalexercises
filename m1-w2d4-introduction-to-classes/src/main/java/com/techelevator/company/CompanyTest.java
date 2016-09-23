package com.techelevator.company;



public class CompanyTest {

	public static void main(String[] args) {
		boolean allTestsPassed = true;
		// write code here that verifies the functionality of the Company class
		
		Company Company = new Company();
		String name = "New Company";
		Company.setName(name);
		if(Company.getName() == null) {
		allTestsPassed = false;
		System.out.println("Test FAILED: No name found.");
		} else if (!name.equals(Company.getName())){
		allTestsPassed = false;
		System.out.println("Test FAILED: Names did not match");
		}

		    
		    
		if(allTestsPassed){
		System.out.println("All Test Passed");

			}
	}

	}
