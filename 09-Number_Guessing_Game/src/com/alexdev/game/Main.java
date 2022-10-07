package com.alexdev.game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		/*
		 * I got a simple idea on a little game that I can do in Java
		 * 
		 * A number guessing game, you will try to guess a number the game will tell you
		 * if your guess is higher or lower than the right number
		 *
		 * I will assume the number to guess will always be between 1-1000000
		 */

		/*
		 * Getting a random number between 1 and 1000000
		 */
		int numberToGuess = new Random().nextInt(1000000) + 1;

		/*
		 * Announcing the start of the game
		 */
		System.out.println("Let the guesses Begin!");

		/*
		 * Creating a int to put the input in and a "tries" counter to show the number
		 * of tries at the end of the game
		 * 
		 * the "tries" counter starts at 1 since the lowest number of tries you can get
		 * is 1
		 */
		int input;
		int tries = 1;

		/*
		 * Getting the first input to start the game
		 */
		input = getInput();

		/*
		 * Looping until the input is equal to the number to guess, when the player wins
		 * the game
		 */
		while (input != numberToGuess) {
			if (input < numberToGuess)
				System.out.println("Higher than " + input);
			if (input > numberToGuess)
				System.out.println("Lower than " + input);
			input = getInput();
			tries++;
		}

		/*
		 * Announcing the end of the game
		 */
		System.out.println("Congrats you win, you got it on " + tries + " tries!");

	}

	/*
	 * Gets the input from the console (System.in)
	 */
	private static int getInput() {
		/*
		 * here can happen an exception, in the case that java can't resolve the console
		 * input into an integer
		 * 
		 * so I keep trying to read the console input until no exception happens
		 */
		try {
			return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (Exception ex) {
			// Announcing that some error happened, and that another input is needed
			System.out.println("Sorry, some error happened, could you try again?");
			// Using recursion here to keep trying to read the console input
			return getInput();
		}
	}
}
