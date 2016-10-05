package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuizRunner {


	public QuizRunner(String fileName) {
		BufferedReader reader =null;
		Scanner scanner = null;
		
		try {
			
			ClassLoader classLoader = getClass().getClassLoader();
			File quizFile = new File(classLoader.getResource(fileName).getFile());
		
			
			
			FileReader fileReader;
			fileReader = new FileReader(quizFile);
			
//			char[] buffer = new char[1024];
//			int charRead = fileReader.read(buffer);
//			<String> stringList = new ArrayList<String>;
//		
//			
//			while(charRead > 0) {
//			
//				
//				for(int i = 0; i <charRead; i++) {
//					if (buffer[i] == "")
//				}
//			}
			
			
			reader = new BufferedReader(fileReader);
			scanner = new Scanner(System.in);
			
			int totalCorrect = 0;
			String line = reader.readLine();
			
//			String[] parts = line.split("\\|");
//			System.out.println(parts[0]);
//			
			while(line != null) {
			int correctAnswer = askQuestion(line);
			boolean wasCorrect = getUserChoice(scanner,correctAnswer);
			
				if(wasCorrect) {
					totalCorrect++;
				}
				line= reader.readLine();
			}
			System.out.print("You got " + totalCorrect + " answer(s) right!");
//			for( int i =1; i < parts.length; i++){
//				String answer = parts[i];
//				
//				if(answer.endsWith("*")) {
//					correctAnswer = i;
//					answer = answer.replace("*", "");
//				}
////				else {
////					System.out.println(i +") " + answer);
//				
//				System.out.println(i + ")" + answer);
//			}
//			 scanner = new Scanner(System.in);
//			int userChoice = scanner.nextInt();
//			
//			if(userChoice == correctAnswer) {
//				System.out.println("You got it. You rock");				
//			}else {
//				System.out.println("Wrong");
//			
//			}
//			
		} catch (FileNotFoundException notFound) {
			System.err.println("File Not Found");
			notFound.printStackTrace();
	

	} catch (IOException e) {
	
			e.printStackTrace();
		
	} finally {
		if(reader != null) {
			
		}if(scanner !=null) {
			scanner.close();
			}
		}
	}
	
	/**
	 * Asks the User a single question and returns the correct index
	 * @param A piepe delimited string containing the question and the choices. The correct the choice
	 * 		is marked by an "*"
	 * @return The correct answer index
	 */
	private int askQuestion(String question) {

		String[] parts = question.split("\\|");
		System.out.println(parts[0]);
		

		int correctAnswer = 0;
		
		for( int i =1; i < parts.length; i++){
			String answer = parts[i];
			
			if(answer.endsWith("*")) {
				correctAnswer = i;
				answer = answer.replace("*", "");
			}
//			else {
//				System.out.println(i +") " + answer);
			
			System.out.println(i + ")" + answer);
	}
		return correctAnswer;
}
	/**
	 * Prompt user for there choice and return wether it is correct
	 * @param correctAnswer Index of the correct answer
	 * Scanner to read user input
	 * @return True if the user user choses the correct answer, otherwise false.
	 */
	private boolean getUserChoice(Scanner scanner, int correctAnswer) {
//		 Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
//		scanner.close();
		
		if(userChoice == correctAnswer) {
			System.out.println("You got it. You rock");		
			return true;
		}else {
			System.out.println("Wrong");
			return false;
		
		}
	}
}
