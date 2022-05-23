package com.revature;

import java.util.Scanner;

import com.revature.models.Person;

public class App {

	// This must be static so that we can use it throughout the class without having
	// to create an instance of the class
	// Static means globally available - class scope
	static Scanner scan = new Scanner(System.in);

	/**
	 * In any Java program, the main() method is the starting point from where the
	 * compiler starts program execution.
	 */
	public static void main(String[] args) {

		System.out.println("This is the first method the JVM invokes... \n"); // the /n is an escape sequence which
																			  // allows us to create one extra line of
																			  // blank-space below
		System.out.println(
				"Welcome to the U-SIMS...would you like to play a game?\ntype YES to continue, or NO to quit:");

		/**
		 * We need some way of accepting user input...How do we accept input from the
		 * user via the console... 
		 * 
		 * Import a Scanner! This comes from the java.util
		 * package which the JRE graces us with
		 */

		int tries = 3;

		while (tries >= 0) {

			String answer = scan.next();

			if (answer.toUpperCase().equals("NO")) {

				System.out.println("Goodbye!");
				System.exit(0); // 0 status indicates the program just quit without anything going wrong!

			} else if (answer.toUpperCase().equals("YES")) {

				System.out.println("Let's go!");

				// invoke a method that starts the game!
				startSimsGame(); // this method is STATIC! so we can just call it from within the class instead of instantiating the class

			} else {
				System.out.println("Sorry, didn't understand you, please try again!");
				// tries = tries - 1;
				tries -= 1;
			}

		}

		System.out.println("Too many tries...exiting now, GOODBYE!");

		/**
		 * This System. exit() method terminates the current JVM running on the system
		 * which results in termination of code being executed currently. This method
		 * takes status code as an argument.
		 */

	}

	// static so we don't need to instantiate the App class to use one of it's
	// methods
	static void startSimsGame() {

		System.out.println("Welcome to U-Sims! \nLet's begin by creating your first U-SIM:");
		
		// invoke a person creator method possibly
		Person sim1;

		// now that we've declared the refernece 
		

		System.exit(0);
	}
}

/**
 * Some Notes on OOP
 * 
 * Great Article here:
 * https://codeburst.io/how-to-do-object-oriented-programming-the-right-way-1339c1a25286
 * 
 */
























