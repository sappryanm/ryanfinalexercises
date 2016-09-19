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
	//String[] welcome = new String[] { "*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*",);
	//return ;
	 
	System.out.println();
	
	System.out.println("****************");
	System.out.println("**** Welcome ****");
	System.out.println("****************");
	System.out.println();
	System.out.println("****************");
	System.out.println("*******TO********");
	System.out.println("****************");
	System.out.println();
	System.out.println("****************");
	System.out.println("*****COUNTDOWN*******");
	System.out.println("****************");
	System.out.println();
	System.out.println("Welcome to countdown. The rules are simple starting at 21 you or the computer");
	System.out.println( "take turns deciding if you will take 1 or 2 sticks. The player left with 0 sticks loses");
	System.out.println( "Do you have what it takes!!!!!!!");
	System.out.println();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//public static void main(String[] args) 
	//int numSticks = 21;
	System.out.println("Would you like to go first? Please enter 1 for yes 2 for no");
	String userInput = reader.readLine();
	int goFirst = Integer.parseInt(userInput);
	take = new Scanner(System.in);
	
	int numberToTake = 0;
//////// Play again loop
	//boolean playAgain = Boolean.valueOf("yes");
	boolean playAgain = true;
	while (playAgain) {

		int numSticks = 21;
	
	//System.out.println("Would you like to go first? Please enter 1 for yes 2 for no");
	//int goFirst = userInput.nextInt();
	//String goFirst = userInput.nextLine();
	
	while (numSticks > 0) {
		
		if (goFirst == 1) {
			System.out.println("There are " + numSticks + " sticks left");
			System.out.println();
			System.out.println("How many sticks do you want to take ( 1 or 2)");
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
			System.out.println();
			System.out.println("How could you let a tiny little computer beat you!!");
			}
			else {
				if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) { 
					numberToTake = 1;  // Computer takes turns Maybe turn into random number
				}
				else {
						numberToTake = 2;
				}
				System.out.println("Computer takes " + numberToTake + "  sticks");
				numSticks = numSticks -numberToTake;
				
				if (numSticks < 1) {
					System.out.println("You Win");
				}
			}
		}
		else  {
			System.out.println("Computer now is in control. He is going to stick it to you");
				if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) { 
					numberToTake = 1;  // Computer takes turns Maybe turn into random number
				}
				else {
						numberToTake = 2;
				}
				System.out.println("Computer Takes " + numberToTake + "  sticks");
				numSticks = numSticks - numberToTake;
				
				if (numSticks <= 0) {
					System.out.println("You Win");
				}
				else {
					System.out.println("There are " + numSticks + "  many sticks left");
					System.out.println("How many sticks do you want to take (1 or 2 )");
					 numberToTake = take.nextInt();
					
					if (numberToTake >= 2) {
						numberToTake = 2;
					}
					else if (numberToTake <= 1) {
						numberToTake = 1;
					}
					numberToTake = numSticks - numberToTake;
					
					if (numSticks <= 0) {
						System.out.print("You Loose!");
						// System.out.println("Would you like to play again? yes/no");
						// String playAgainYes = reader.readLine();
						// playAgain = playAgainYes.equalsIgnoreCase("yes");
					    // if (playAgainYes == "yes") 
					       // playAgain = true;
					    //}else{
					       // playAgain = false; 
					

				}
			}
		
		}
		
		/*if (answer == "yes") {
			numSticks = 21;
		}else {
			numSticks = 0;
		}*/
	}
	System.out.println("Would you like to play again? yes/no");
	String answer = reader.readLine();
	playAgain = answer.equalsIgnoreCase("yes") ;
			/*if (answer.equalsIgnoreCase("true") || answer.equalsIgnoreCase("t") || 
        answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))
				return Boolean.parseBoolean("true")
		}else{
			playAgain = false; 
		}	*/
			
	}
	/*System.out.println("Would you like to play again? yes/no \n");
	String answer = reader.readLine();
	playAgain = answer.equalsIgnoreCase("yes");
			if (playAgain == "yes") {
				playAgain = true;
		}else{
			playAgain = false; 
		} */
	}
	}


