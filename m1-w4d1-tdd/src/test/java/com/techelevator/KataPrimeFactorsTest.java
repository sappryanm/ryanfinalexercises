package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPrimeFactorsTest {

	
	
//	Kata Prime Factor
//	Factorize a positive integer number into its prime factors.
//	Use the TDD approach to write tests that call a single method 
//	Factorize(). Given a positive integer input n, return
//	its prime factors.
//	1 is always omitted from the result set.
//	Sample Output
//	2 -> returns [2]
//	3 -> returns [3]
//	4 -> returns [2, 2]
//	6 -> returns [2, 3]
//	7 -> returns [7]
//	8 -> returns [2, 2, 2]
//	9 -> returns [3, 3]
//	10 -> returns [2, 5]
//	Link to Wikipedia Prime Factors
	private KataPrimeFactors factors;
	@Before
	//Arrange
	public void setup() {
		factors = new KataPrimeFactors();
	}
	@Test
	public void given_two_return_2() {

		// Act
		int[] results = factors.factorize(2);
		//Assert
		Assert.assertEquals(1, results.length);
		Assert.assertEquals(2, results[0]);
	}
	@Test
	public void given_three_return3() {

		// Act
		int[]  results = factors.factorize(3);
		//Assert
		Assert.assertEquals(1, results.length);
		Assert.assertEquals(3, results[0]);
		
	}
	@Test
	public void given_four_return_2_2() {
		int[] results = factors.factorize(4);
		Assert.assertEquals(2, results.length);
		Assert.assertEquals(2, results[0]);
		Assert.assertEquals(2, results[1]);
	}
	@Test
	public void given_6_return_2_3() {
		int[] results = factors.factorize(6);
		Assert.assertEquals(2, results.length);
		Assert.assertEquals(2, results[0]);
		Assert.assertEquals(3, results[1]);
	}
	@Test
	public void given_7_return_7() {
		int[] results = factors.factorize(7);
		Assert.assertEquals(1, results.length);
		Assert.assertEquals(7, results[0]);
	}
	@Test
	public void given_8_return_2_2_2() {
		int[] results = factors.factorize(8);
		Assert.assertEquals(3, results.length);
		Assert.assertEquals(2, results[0]);
		Assert.assertEquals(2, results[1]);
		Assert.assertEquals(2, results[2]);
	}
	@Test
	public void given_9_return_3_3() {
		int[] results = factors.factorize(9);
		Assert.assertEquals(2, results.length);
		Assert.assertEquals(3, results[0]);
		Assert.assertEquals(3, results[1]);
	}
	
	@Test
	public void given_10_return_2_5() {
		int[] results = factors.factorize(10);
		Assert.assertEquals(2, results.length);
		Assert.assertEquals(2, results[0]);
		Assert.assertEquals(5, results[1]);
	}
	
	
}

