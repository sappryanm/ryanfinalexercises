package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {

	public int[] factorize(int value) {
		List<Integer>	results = new ArrayList<Integer>();
		if(value <0 ) {
			return new int[] {};
		}
		else if (isPrime(value)) {
			return new int[] {value};
	
		}
		else 
			for(int i =2; i < value; i++) {
				if(value % i == 0) {
					results.add(i);
					int otherFactor = value / i;
					int[] otherFactorResults = factorize(otherFactor);
					
					for(int j= 0; j < otherFactorResults.length; j++) {
						results.add(otherFactorResults[j]);
					}
					break;
				}
				
			}
			
			int[] arrayResults = new int[results.size()];
			for(int i =0; i <results.size(); i++)	{
				arrayResults[i] = results.get(i);
			}
				return arrayResults;
		
	}
	
	private boolean isPrime(int value) {
		boolean isPrime = true;
			for(int i = 2 ; i < value; i++) {
				if(value % i == 0) {
					isPrime = false;
				}
			}
				
		return isPrime;
	}
//	Kata Prime Factor
//	Factorize a positive integer number into its prime factors.
//	Use the TDD approach to write tests that call a single method Factorize(). Given a positive integer input n, return its prime factors.
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
}
