package com.techelevator.product;



public class ProductTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of your Product class
		 boolean allTestsPassed = true;
         
         /*** Test should pass if a person object has been initialized. ***/
         Product newProduct = new Product("Apples", 42, 1.2);
         if(newProduct.getName() == null) {
             allTestsPassed = false;
             System.out.println("Test FAILED: The result should display first product ande price.");
         }
         
        
         Product secondProduct = new Product("Bannas", 12, 1.2);
         if(secondProduct.getName() == null) {
             allTestsPassed = false;
             System.out.println("Test FAILED: The result should display second product ande price.");
         }
         

        
         
         
       
                 
         

 if(allTestsPassed) {
     System.out.println("All tests PASSED!");
 }
	}

}
