package com.techelevator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Maps;
import com.google.common.collect.Maps.EntryTransformer;


public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> animalGroups = new HashMap<String, String>();
		
		animalGroups.put("rhino", "Crash");
		animalGroups.put("giraffe", "Tower");
		animalGroups.put("elephant", "Herd");
		animalGroups.put("lion", "Pride");
		animalGroups.put("crow", "Murder");
		animalGroups.put("pigeon", "Kit");
		animalGroups.put("flamingo", "Pat");
		animalGroups.put("dog", "Pack");
		animalGroups.put("crocodile", "Float");
		
		if(!animalGroups.containsKey(animalName.toLowerCase())){
			return "unknown";
		} else {
		return (animalGroups.get(animalName.toLowerCase())) ;
		}
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double>  saleprice = new HashMap<String, Double>();
		
		saleprice.put("kitchen4001", 0.20);
		saleprice.put("garage1070", 0.15);
		saleprice.put("livingroom", 0.10);
		saleprice.put("kitchen6073", 0.40);
		saleprice.put("bedroom3434", 0.60);
		saleprice.put("bath0073", 0.15);
		
		if (!saleprice.containsKey(itemNumber.toLowerCase())) {
			return 0.00;
		}
		return saleprice.get(itemNumber.toLowerCase());
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		if(peterMoney > 0 && paulMoney <1000)
		{
			int halfOfPetersMoney = peterMoney /2;
			paulMoney += halfOfPetersMoney;
			peterMoney -= halfOfPetersMoney;
		}
		//Map<String, Integer> peterPaul = new HashMap<String, Integer>();
		
		
		peterPaul.put("Peter", peterMoney);
		peterPaul.put("Paul", paulMoney);
		/*
		Map<String, Integer> listpeter = new HashMap<String, Integer>();
		listpeter.put("Peter", 2000);
		listpp.put("Peter", 2000); */
		
		return peterPaul;
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 750000, "PeterPaulPartnership": 63500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		int partnership = 0;
		if(peterMoney >= 5000 && paulMoney >= 10000)
		{
			//double quarterOfMoney =  0.25;
			partnership = (paulMoney/4) + (peterMoney/4);
			paulMoney -= (paulMoney /4);
			peterMoney -= (peterMoney / 4);
			
		}
		peterPaul.put("Peter", peterMoney);
		peterPaul.put("Paul", paulMoney);
		peterPaul.put("PeterPaulPartnership", partnership);
		return peterPaul;
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String>  list = new HashMap<String, String>();
		//for(String i: words) {
		for ( int  i = 0; i < words.length; i++)	{
		String newString = words[i];
		String newKey = newString.substring(0 ,1);
		String newValue = newString.substring(newString.length()-1);
		list.put(newKey, newValue);
			
		}
		return list;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
	/*Map<String, Integer>  list = new HashMap<String, Integer>();
	
		for( int i = 0; i < words.length; i++){
			int count = 1;
			for( int x = i + 1; x < words.length; x++) {
				if((words[i]) == (words[x])); {
				count ++;
				}
			} list.putIfAbsent(words[i], count);
			}
		return list;
}*/

		Map<String, Integer> countTheLetter = new HashMap<String, Integer>();
		for (String i: words) {
		if (!countTheLetter.containsKey(i)) {
		countTheLetter.put(i, 1);
		}
		else {
		int count = countTheLetter.get(i);
		countTheLetter.put(i, count + 1);
		}
		}
		return countTheLetter;
		}
	
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> intCountList = new HashMap<Integer, Integer>();
		for (Integer i: ints) {
		if (!intCountList.containsKey(i)) {
		intCountList.put(i, 1);
		}
		else {
		int count = intCountList.get(i);
		intCountList.put(i, count + 1);
		}
		}
		return intCountList;
		}
	
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> wordM = new HashMap<String, Boolean>();
		for (String i: words) {
		if (!wordM.containsKey(i)) {
		wordM.put(i, false);
		}
		else {
		//Boolean count = wordM.get(i);
		wordM.put(i, true);
		}
		}
		return wordM;
		}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {

		Map<String, Integer> consolidateInventory = new HashMap<String, Integer>();
		consolidateInventory.putAll(mainWarehouse);
		
		for(String key: remoteWarehouse.keySet()) {
		if (consolidateInventory.containsKey(key)) {
		int main = mainWarehouse.get(key);
		int remote = remoteWarehouse.get(key);
		int consolidate = main + remote;
		consolidateInventory.replace(key, consolidate);
		} else {
		consolidateInventory.put(key, remoteWarehouse.get(key));
		}
		}
		return consolidateInventory;
		}
		
	

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		Map<String, Integer> newList = new HashMap<String, Integer>();
		
		for (int i = 0; i < words.length; i++) {
			String newWords = words[i];
			int count = 0;
			String newLast2 = newWords.substring(newWords.length() - 2);
			for( int x = 0; x < (newWords.length() -2); x++){
				if (newLast2.equals(newWords.substring(x, x+2))) {
					count++;
				}
			}
				newList.put(words[i], count);	
		}			
		return newList;
	}	
	
}
