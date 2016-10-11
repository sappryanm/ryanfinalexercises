package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.mockito.internal.matchers.Contains;

public class WordSearch {
private static Object IgnoreCase;

//   Currently running on WordFinder.java but not wordscearh
	  public static void main(String[] args) throws Exception {
	        BufferedReader readerUser = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("What would you like to search for? ");
	        String userInput = readerUser.readLine();
	        String userInputLower = userInput.toLowerCase();
	      //  File quizFile = new File(getResource("").getFile());
	       File file = new File("/Users/rsapp/Development/workspaces/ryansapp-java-exercises/"
	      	+ "m1-w4d2-file-io-part-1/src/main/resources/alices_adventures_in_wonderland.txt");
	        //File file = new File("./alices_adventures_in_wonderland.txt");
	        BufferedReader fileReader = new BufferedReader(new FileReader(file));
//String fileName = classLoader.getResources(fileName).getFile();
	        BufferedReader fileReaderLower = new BufferedReader(new FileReader(file));
	        	fileReaderLower = fileReaderLower.toString().toLowerCase();
	        String line = null;
	        int index = 1;
	       String noCase = null;
//			if(IgnoreCase.equals("-i"))
				while ((line = fileReaderLowerCase.readLine()) != null) {
	            if (line.contains(userInputLower)) {
	                System.out.println(index+ line);
	               // System.out.println(line);
	            }
	            index++;
				
			}
	        while ((line = fileReader.readLine()) != null) {
	            if (line.contains(userInput)) {
	                System.out.println(index+ line);
	               // System.out.println(line);
	            }
	            index++;
	        }

	        fileReader.close();
	    }

}
