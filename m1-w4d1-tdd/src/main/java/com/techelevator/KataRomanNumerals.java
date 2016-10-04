package com.techelevator;

import java.util.List;

public class KataRomanNumerals {

public int number;
	//constructor
	public KataRomanNumerals(int number)
	{	
	this.number = number;
	}
	
//	
//	public static String arabicToRoman(int arabic) {
//		  List<String> result = new ArrayList();
//		  for (int i = 0; i < arabic; i++) {
//		    result.append("I");
//		  }
//		  return result.toString();
//		}
	public static String arabicToRoman(int arabic) {
		  StringBuilder result = new StringBuilder();
		  int remaining = arabic;
		  if (remaining >= 9) {
		    result.append("IX");
		    remaining -= 9;
		  }
		  if (remaining >= 5) {
		    result.append("V");
		    remaining -= 5;
		  }
		  if (remaining >= 4) {
		    result.append("IV");
		    remaining -= 4;
		  }
		  for (int i = 0; i < remaining; i++) {
		    result.append("I");
		  }
		  return result.toString();
		}
	
	
	
	public KataRomanNumerals(String number)
	{
		this(Integer.parseInt(number));
	}
	
	
	public String toString()
	{
		String result = "";
		
		int thousands =  this.number / 1000;
		result += times(thousands, "M");
		
		int hundreds = this.number / 100 % 10;
		result += times(hundreds, "C", "D", "M");

		int tens = this.number / 10 % 10;
		result += times(tens, "X", "L", "C");
		
		int ones = this.number % 10;
		result += times(ones, "I", "V", "X");
		
		
		return result;
	}
	
	protected static String times(int number, String character)
	{
		String result = "";
		for(int i = 0; i < number; i++)
		{
			result += character;
		}
		return result;
	}
	
	public String times(int number, String onesChar, String fivesChar, String tensChar )
	{
		switch(number)
		{
			case 0:
				return "";
			case 1:
			case 2:
			case 3:
				return times(number, onesChar);
			case 4:
				return onesChar + fivesChar;
			case 5:
			case 6:
			case 7:
			case 8:
				return fivesChar + times(number - 5, onesChar);
			case 9:
				return onesChar + tensChar;
			default:
				throw new IllegalArgumentException("Only single digits allowed - not " + number);
		}
		
	}
}



