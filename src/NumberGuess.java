/**
 * A program that prompts the user to guess a number between 1 and 100.
 * The user is given multiple guesses until they guess the correct number.
 * The program then evaluates the user's success.
 * 
 * @author alexlacey
 * @version 20170215
 *
 */

import java.util.Scanner; //import the Scanner utility

public class NumberGuess {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		int answer = (int)(100 * Math.random()) + 1; // pick a random number between 1 and 100
		int guessCount = 0; // the amount of times a user needs to guess
		int guess = 0; // the user's specific guess
		boolean correctGuess = false; // whether the guess is correct
		
		// while loop that prompts the user to guess and evaluates the guess
		while (correctGuess == false) {
			
			guess = getGuess(keyboard);
			guessCount++;
			
			correctGuess = evaluateGuess(guess, answer); 
			
		}
		
		// determine the correct success message
		String countMessage = "";
		if (guessCount >= 10) {
			countMessage = "This just isn't your game.";
		}
		else if (guessCount >= 8) {
			countMessage = "That was not very good.";
		}
		else if (guessCount >= 7) {
			countMessage = "That was OK.";
		}
		else if (guessCount >= 5) {
			countMessage = "That was good.";
		}
		else if (guessCount >= 2) {
			countMessage = "That was amazing!";
		}
		else if (guessCount == 1) {
			countMessage = "That was lucky!";
		}
		
		// informing the user of performance
		System.out.println("I had chosen " + answer + " as the target number.");
		System.out.println("You guessed it in " + guessCount + " tries.");
		System.out.println(countMessage);
		
	}
	
	private static int getGuess(Scanner in) {
		System.out.print("Enter a guess between 1 and 100: ");
		int guess = in.nextInt();
		return guess;
	}
	
	private static boolean evaluateGuess(int guess, int answer) {
		if (guess == answer) {
			System.out.println("Congratulations! Your guess was correct!\n");
			return true;
		}
		else {
			if (guess < answer) {
				System.out.println("Your guess was too low. Try again.");
			}
			else if (guess > answer) {
				System.out.println("Your guess was too high. Try again.");
			}
			return false;
		}

	}

}
