package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Hashtable;
import java.util.List;
//import java.util.Map;
//import java.util.Properties;



public class myStoreResults {

	/*public static Map<String,List<String>>categoryMap = new Hashtable<String, List<String>>();


	   Properties prop = new Properties();
	    prop.load(new FileInputStream("/displayCategerization.properties"));
	   for (Map.Entry<Object, Object> entry : prop.entrySet())
	   {
	       List<String> categoryList = categoryMap.get((String) entry.getKey());
	       if (categoryList == null)
	       {
	           categoryList = new ArrayList<String>();
	           LogDisplayService.categoryMap.put((String) entry.getKey(), categoryList);
	       }
	       categoryList.add((String) entry.getValue());
	   }*/
	
	   public static void main(String[] args) {
	   //public List<String> array2List(String[] stringArray) {
		   List<String> categories = Arrays.asList("Tire    ", "Headlight    ", "", "Stero      ", "Door Handle      ","Seat      ", "Windshield Wiper       ");
		   categories.forEach(System.out::print);
	
		  
			   Product[] productGrid = new Product[] { new Tire(00001212121, "ContientalExtreme", "Continential", 12.00, 112, "Speed Rating ZA", 36, false), new DoorHandle(0, null, null, 0, 0) };
		

			for(Product product : productGrid) {
				String name = product.getName();
				Long id = product.getId();
				String manufacturer = product.getManufacturer();
				Double Weight = product.getWeight();
				String speed = Tire.getSpeedRating();
				Double priceSuccess = product.getPrice();
				int recommendedPSI = Tire.getRecommendPSI();
				boolean handlesSnow = Tire.isHandlesSnow();
				System.out.println("_________________________________________________________");
				System.out.println("name: " + name + " Id Number : " + id + "   Manufacturer:  " + manufacturer +  "   Weight : " + Weight+ "    Speed Rating:  " + speed);
				System.out.println("Price: " + priceSuccess + " Recommended PSi : " + recommendedPSI + "Handles Snow" + handlesSnow);
				System.out.println("____________________________________________");

				System.out.println();
	   }
	   }
}