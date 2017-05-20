
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

		Scanner keyboard = new Scanner(System.in);

		int answer = (int) (100 * Math.random()) + 1; // computer picks a random number between 1 and 100
		int guessCount = 0; // the amount of times a user needs to guess
		int guess = 0; // the user's specific guess
		boolean correctGuess = false; // whether the guess is correct

		// prompt and evaluate each guess
		while (correctGuess == false) {
			guess = getGuess(keyboard);
			guessCount++;
			correctGuess = evaluateGuess(guess, answer);
		}

		// inform the user of performance
		System.out.println("You guessed it in " + guessCount + " tries.");

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
		} else {
			if (guess < answer) {
				System.out.println("Your guess was too low. Try again.");
			} else if (guess > answer) {
				System.out.println("Your guess was too high. Try again.");
			}
			return false;
		}

	}

}
