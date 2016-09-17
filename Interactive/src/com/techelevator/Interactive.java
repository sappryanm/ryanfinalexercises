package com.techelevator;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interactive {

	private static Scanner take;

	public static void main(String[] args) throws IOException {
		
		
		//System.out.println("Enter a number");
		//String input = reader.readLine();
		//int number = Integer.parseInt(input);
	System.out.println("Welcome to countdown. The rules are simple starting at 21 your or the computer");
	System.out.println( " take turns deciding if you will take 1 or 2 sticks. The player left with 0 sticks looese");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//public static void main(String[] args) 
	int numSticks = 21;
	System.out.println("Would you like to go first? Please enter 1 for yes 2 for no");
	String userInput = reader.readLine();
	int goFirst = Integer.parseInt(userInput);
	take = new Scanner(System.in);
	
	int numberToTake = 0;

	//System.out.println("Would you like to go first? Please enter 1 for yes 2 for no");
	//int goFirst = userInput.nextInt();
	//String goFirst = userInput.nextLine();
	
	while (numSticks > 0) {
		
		if (goFirst == 1) {
			System.out.println("There are " + numSticks + " sticks");
			System.out.println("How many sticks to take ( 1 or 2)");
			numberToTake= take.nextInt();
			//numSticks = numSticks -numberToTake;
		if (numberToTake > 2) {
		numberToTake = 2;
		}
		else if  (numberToTake < 1) {
			numberToTake = 1;
		}
		
		numSticks = numSticks - numberToTake;
		
		if (numSticks <= 0) {
			System.out.println("Your Lose!");
			}
			else {
				if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) { 
					numberToTake = 1;  // Computer takes turns Maybe turn into random number
				}
				else {
						numberToTake = 2;
				}
				System.out.println("Computer" + numSticks + " sticks");
				numSticks = numSticks -numberToTake;
				
				if (numSticks < 1) {
					System.out.println("You Win");
				}
			}
		}
		else  {
			
				if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) { 
					numberToTake = 1;  // Computer takes turns Maybe turn into random number
				}
				else {
						numberToTake = 2;
				}
				System.out.println("Computer Take " + numSticks + " sticks");
				numSticks = numSticks - numberToTake;
				
				if (numSticks <= 0) {
					System.out.println("You Win");
				}
				else {
					System.out.println("There are" + numSticks + " sticks");
					System.out.println("How many sticks to take (1 or 2 )");
					 numberToTake = take.nextInt();
					
					if (numberToTake > 2) {
						numberToTake = 2;
					}
					else if (numberToTake < 1) {
						numberToTake = 1;
					}
					numberToTake = numSticks - numberToTake;
					
					if (numSticks <= 0) {
						System.out.print("You Loose!");
					}
				}
			}
		
		}	
	}
}

