package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class QuizMaker {

	public static void main(String[] args) {
		QuizRunner runner = new QuizRunner("quiz_questions.txt");
		
//		try {
//			
//			ClassLoader classLoader = getClass().getClassLoader();
//			File file = new File(classLoader.getResource("file/test.xml").getFile());
//			File quizFile = new File("quiz_questions.txt");
//			FileReader fileReader;
//			fileReader = new FileReader(quizFile);
//			BufferedReader reader = new BufferedReader(fileReader);
//		} catch (FileNotFoundException notFound) {
//			System.err.println("File Not Found");
//			notFound.printStackTrace();
//		}
//		
//	}
	}
}
