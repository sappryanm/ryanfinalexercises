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
	@Test
	public void test_string_amount_format() {
	String dollarToString = dollarTest.toString();
	Assert.assertEquals("$26.55", dollarToString);
	}

}
