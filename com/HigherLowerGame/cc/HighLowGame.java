package com.HigherLowerGame.cc;
import java.util.Random;
import java.util.Scanner;
public class HighLowGame {
	public static void main(String[] args) {
		Random random = new Random();
		int computerInput = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		int userTries = 0;
		boolean done = false;
		
		while (userTries <5) {
			System.out.println("Choose a number between 1 and 100.");
			System.out.println("Please enter in a whole number and press enter and continue.");
			
			int userInput = scanner.nextInt();
			
			if (userInput < 1 || userInput > 100) {
				System.out.println("Please, try again");
			} else if (userInput > computerInput) {
				System.out.println("lower");
				userTries++;
			} else if (userInput < computerInput) {
				System.out.println("Higher");
				userTries++;
			} else if (userInput == computerInput){
				done = true;
        break;
			}
		}
		if (done) {
			System.out.println("You win.");
		} else {
			System.out.println("You Died");
			System.out.println("The number was " + computerInput);
		} scanner.close();
	}
}
