package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordSearch {
//   Currently running on WordFinder.java but not wordscearh
	  public static void main(String[] args) throws Exception {
	        BufferedReader readerUser = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("What would you like to search for? ");
	        String userInput = readerUser.readLine();
	      //  File quizFile = new File(getResource("").getFile());
	       File file = new File("/Users/rsapp/Development/workspaces/ryansapp-java-exercises/"
	      	+ "m1-w4d2-file-io-part-1/src/main/resources/alices_adventures_in_wonderland.txt");
	        //File file = new File("./alices_adventures_in_wonderland.txt");
	        BufferedReader fileReader = new BufferedReader(new FileReader(file));
//String fileName = classLoader.getResources(fileName).getFile();
	        String line = null;
	        int index = 1;
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
