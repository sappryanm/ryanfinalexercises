package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class FruitTreeTest {
	private FruitTree testFruitTree;
	@Before
	public void setUp(){
		testFruitTree = new FruitTree("Apple", 20);
	}

	
	
	@Test
	public void intialize_values_are_stores_correctly() {
		
		
		String FruitType= testFruitTree.getTypeOfFruit();
		Integer fruitPiecesLEft = testFruitTree.getPiecesOfFruitLeft();
		
		//Assert.assertEquals("Ryan", firstName);
		//Assert.assertEquals("Sapp", LastName);
		//Assert.assertEquals("Ryan Sapp", FullName);

		 
	}
	@Test
	public void test_Number_Of_Pieces() {
		
		testFruitTree.PickFruit( 102);
		//int beforeRaise = (int)testFruitTree.getAnnualSalary();
		//double testRaiseAmount = beforeRaise + employeeRyan.RaiseSalary(102.00);
	}

	
	/*
	 * 
	
	 */
	
	 @Test
    public void getters_setters_test(){
    /*** Test should pass if a person object has been initialized. ***/
    FruitTree employeeTest = new FruitTree("apple", 20);
    //if(planeTest.getPlaneNumber() == null) {
       // allTestsPassed = false;
    int successPiecesOfFruit = employeeTest.getPiecesOfFruitLeft();
    Assert.assertEquals(20, successPiecesOfFruit);
    String successFirstName = employeeTest.getTypeOfFruit();
    Assert.assertEquals("apple", successFirstName);
  //  boolean successPickFruit = employeeTest.PickFruit();
    //Assert.assertFalse("Doors Closed and Moving", successMoving);

    
} 
}
	
	


