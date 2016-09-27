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
		 
	}
	@Test
	public void test_Number_Of_Pieces() {
		
		testFruitTree.PickFruit( 10);
		
		Assert.assertTrue("We  can go up", );
		
	}

	 @Test
    public void getters_setters_test(){
    
    FruitTree employeeTest = new FruitTree("apple", 20);

    int successPiecesOfFruit = employeeTest.getPiecesOfFruitLeft();
    Assert.assertEquals(20, successPiecesOfFruit);
    String successFirstName = employeeTest.getTypeOfFruit();
    Assert.assertEquals("apple", successFirstName);
  //  boolean successPickFruit = employeeTest.PickFruit();
    //Assert.assertFalse("Doors Closed and Moving", successMoving);  
} 
}
	
	


