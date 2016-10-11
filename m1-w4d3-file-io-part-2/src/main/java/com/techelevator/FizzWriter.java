package com.techelevator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		
		PrintWriter fileOutput = null;
		
		try {
			fileOutput = new PrintWriter(new FileOutputStream("FizzBuzzTest.txt"));
			String value = "";
			for( int i =0; i<=300; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i !=0) {
		          value = "FizzBuzz";
		       }
		       if (i % 3 == 0 && i !=0) {
		           value = "Fizz";
		       }
		       if (i % 5 == 0 && i !=0) {
		    	   value ="Buzz";
		       }
		       value = Integer.toString(i);
			   
			
			fileOutput.println(value);
			fileOutput.flush();
			}
	fileOutput.flush();
	

	
}catch (FileNotFoundException e) {
	System.out.println("Could Not Open file");
	System.exit(1);
}finally{
		fileOutput.close();
	}
	}





}


