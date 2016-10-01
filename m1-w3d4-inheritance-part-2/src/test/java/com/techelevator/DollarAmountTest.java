package com.techelevator;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class DollarAmountTest {
	DollarAmount dollarTest;
	@Before
	public void setUp() {
		 dollarTest = new DollarAmount(2655);
	}
/*
	@Test
	public void  test_toString() {
		DollarAmount dollarTest2 = new DollarAmount(33);
		//DollarAmount dollarTest = new TotalAmountincents(34);
		dollarTest2.toString();
		//totalAmountInCents
		int dollarCents =dollarTest2.getCents();
//		Assert.assertEquals("$34.00", dollarTest2, 0.009);
//		Assert.assertEquals(00, dollarCents, 0.01);
	}
	*/
	@Test
	public void test_string_amount_format() {
		dollarTest.hashCode();
	String dollarToString = dollarTest.toString();
	Assert.assertEquals("$26.55", dollarToString);
	}

	@Test
	public void test_hashcode(){
		dollarTest.isNegative();
		int dollarCents = dollarTest.getCents();

		Assert.assertEquals(55, dollarCents);
	}
	@Test
	public void test_compareTo(){
		int dollarCents = dollarTest.compareTo(dollarTest);

		Assert.assertEquals(0, dollarCents);
	}
	@Test
	public void test_compareTo_Dollarsequal1(){
		DollarAmount dollarTest4 = new DollarAmount(1);
		int dollarCents = dollarTest.compareTo(dollarTest4);
		Assert.assertEquals(1, dollarCents);
	}
	@Test
	public void test_compareTo_Dollarsequal_1(){
		DollarAmount dollarTest4 = new DollarAmount(40);
		int dollarCents = dollarTest4.compareTo(dollarTest);
		//int result = -1;
		Assert.assertEquals(-1, dollarCents);
	}
	
	@Test
	public void test_compareTo3(){
		DollarAmount dollarTest4 = new DollarAmount(6655);
		boolean dollarCents = dollarTest.isLessThan(dollarTest4);
		Assert.assertTrue("not True", dollarCents);
	}
	@Test
	public void test_compareTo4(){
		DollarAmount dollarTest5 = new DollarAmount(6655);
		boolean dollarCents = dollarTest.isGreaterThan(dollarTest5);
		Assert.assertFalse("not True", dollarCents);
	}
	@Test
	public void test_compareTo5(){
		DollarAmount dollarTest5 = new DollarAmount(1655);
		boolean dollarCents = dollarTest.isGreaterThan(dollarTest5);
		Assert.assertTrue("not True", dollarCents);
	}
	@Test
	public void test_compareTo6(){
		DollarAmount dollarTest6 = new DollarAmount(2655);
		boolean dollarCents = dollarTest.isGreaterThanOrEqualTo(dollarTest6);
		Assert.assertTrue("not True", dollarCents);
	}
	@Test
	public void test_compareTo7(){
	DollarAmount dollarTest7 = new DollarAmount(1899);
		boolean dollarCents = dollarTest.isGreaterThanOrEqualTo(dollarTest7);
		Assert.assertTrue("not True", dollarCents);
}
	@Test
	public void test_compareTo_7(){
	DollarAmount dollarTest7 = new DollarAmount(1899);
		boolean dollarCents = dollarTest7.isGreaterThanOrEqualTo(dollarTest);
		Assert.assertFalse("not True", dollarCents);
}
	@Test
	public void test_compareTo_7_2(){
	DollarAmount dollarTest7 = new DollarAmount(1899);
		boolean dollarCents = dollarTest7.isGreaterThanOrEqualTo(dollarTest);
		Assert.assertFalse("not True", dollarCents);
}
	@Test
	public void test_compareTo8(){
		DollarAmount dollarTest10 = new DollarAmount(2655);
		boolean dollarCompare = dollarTest.isLessThanOrEqualTo(dollarTest10);
	Assert.assertTrue("It is Greater then when it should be less than or equal to", dollarCompare);
	}
	@Test
	public void test_compareTo9(){
		DollarAmount dollarTest10 = new DollarAmount(1655);
		boolean dollarCompare = dollarTest.isLessThanOrEqualTo(dollarTest10);
	Assert.assertFalse("It is Greater then when it should be less than or equal to", dollarCompare);
	}
	@Test
	public void test_compareToLessThan1(){
		DollarAmount dollarTest4 = new DollarAmount(6655);
		boolean dollarCents = dollarTest.isLessThan(dollarTest4);
		Assert.assertTrue("not True", dollarCents);
	}
	@Test
	public void test_isNegtaiveFails(){
		DollarAmount dollarTest4 = new DollarAmount(-6655);
		boolean dollarCents = dollarTest4.isNegative();
		Assert.assertTrue("not True", dollarCents);
	}
	@Test
	public void test_DollarAmount_minus(){
		DollarAmount dollarTest4 = new DollarAmount(1655);
		dollarTest.minus(dollarTest4);
		int dollarCents = dollarTest.getDollars() - dollarTest4.getDollars();
		
		//DollarAmount dollarCents = dollarTest.minus(dollarTest4);
		Assert.assertEquals(10 , dollarCents);
	}
	@Test
	public void test_DollarAmount_plus(){
		DollarAmount dollarTest4 = new DollarAmount(10000); 
		dollarTest.plus(dollarTest4);
		int dollarCents = dollarTest.getDollars() + dollarTest4.getDollars();
		//DollarAmount dollarCents = dollarTest.minus(dollarTest4);
		Assert.assertEquals(126, dollarCents);
	}
	@Test
	public void test_equals(){
		
		DollarAmount dollarTest4 = new DollarAmount(2655); 
		boolean success = dollarTest.equals(dollarTest4);
//		
		
		dollarTest.equals(dollarTest4);
//		int dollarCents = dollarTest.getDollars();
//		int dollarCents2 = dollarTest4.getDollars();
		
		//DollarAmount dollarCents = dollarTest.minus(dollarTest4);
		//Assert.assertEquals("$26.55",  );
		//Assert.assertTrue("Not Equal", success);
	}
	@Test
	public void test_compareTo_7_3(){
	DollarAmount dollarTest7 = new DollarAmount(2655);
		boolean dollarCents = dollarTest7.equals(dollarTest);
		Assert.assertTrue("not True", dollarCents);
}
	@Test
	public void test_compareTo_7_4(){
	DollarAmount dollarTest7 = new DollarAmount(0);
		boolean dollarCents = dollarTest.equals(dollarTest7);
		Assert.assertFalse("not True", dollarCents);
}
	@Test
	public void test_equals1branch(){
		
		DollarAmount dollarTest4 = new DollarAmount(2655); 
		//boolean success = dollarTest.equals(dollarTest4);
//		
		//int dollarCents = dollarTest.getDollars();
		//int dollarcents2 =dollarTest4.getDollars();
		int oneHundred = dollarTest.getDollars() + dollarTest.getCents();
//		dollarTest.equals(dollarTest4);
//		dollarTest.equals();
		Assert.assertEquals(dollarTest, dollarTest4);
		
	}
	@Test
	public void test_equals_null(){
		
		dollarTest.equals(null);
	}
	
	
}
