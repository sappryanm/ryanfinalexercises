package com.techelevator;

import org.junit.*;


import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	private String expectedRomanAsString;
	private int number1;
	private String KataRoman;
	private KataRomanNumerals roman;
	private KataRomanNumerals numberS;
	
	//public KataRomanNumeralsTest(String expectedRomanAsString, int number)
	@Before
	public void setup() {
		roman = new KataRomanNumerals(number1);
	}
	   

//	@Test
//	   public void convertIntToRoman() {
//		   //String convert = KataRomanNumerals.times(1, "I");
//	      Assert.assertEquals("I",KataRomanNumerals.times(1, "I") );
//	   }
	@Test
	public void oneTwoThreeRepeatIs() {
	  Assert.assertEquals("1", "I", KataRomanNumerals.arabicToRoman(1));
	  Assert.assertEquals("2", "II", KataRomanNumerals.arabicToRoman(2));
	  Assert.assertEquals("3", "III", KataRomanNumerals.arabicToRoman(3));
	}
	@Test
	public void four() {
	  Assert.assertEquals("4", "IV", KataRomanNumerals.arabicToRoman(4));
	}
	@Test
	public void five() {
	  Assert.assertEquals("5", "V", KataRomanNumerals.arabicToRoman(5));
	}
	@Test
	public void six() {
	  Assert.assertEquals("6", "VI", KataRomanNumerals.arabicToRoman(6));
	}
	@Test
	public void nineIsXPrefixedByI() {
	  Assert.assertEquals("9", "IX", KataRomanNumerals.arabicToRoman(9));
	}
	public void test_number_toString_10() {
	KataRomanNumerals numberS = new KataRomanNumerals(10);
	
		Assert.assertEquals("I", numberS.toString());
	
	}
	@Test 
	public void test_number_To_STring_100() {
	KataRomanNumerals numberS = new KataRomanNumerals(100);
	
		Assert.assertEquals("C", numberS.toString());
	
	}
	@Test
	public void test_Roman_Num_To_Strings_1000()
	{
		KataRomanNumerals roman = new KataRomanNumerals(1000);
		Assert.assertEquals("M", roman.toString() );
	}
	
	



	}


