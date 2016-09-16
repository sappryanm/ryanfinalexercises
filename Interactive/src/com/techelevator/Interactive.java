package com.techelevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interactive {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number");
		String input = reader.readLine();
		int number = Integer.parseInt(input);
	}

}
