package com.techelevator;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class WordFinder {
	  public static void main(String[] args) throws Exception {
	        BufferedReader readerUser = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("What would you like to search for? ");
	        String userInput = readerUser.readLine();
	        
	       File file = new File("http://www.textfiles.com/humor/TAGLINES/aphorism.txt");
	        BufferedReader fileReader = new BufferedReader(new FileReader(file));

	        String line = null;
	        int index = 1;
	        while ((line = fileReader.readLine()) != null) {
	            if (line.contains(userInput)) {
	                System.out.println("Match on line " + index);
	                System.out.println(line);
	            }
	            index++;
	        }

	        fileReader.close();
	    }
	
	

}
