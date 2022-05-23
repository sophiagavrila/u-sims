package com.revature;

import com.revature.models.Artist;
import com.revature.models.Person;

public class TesterApp {

	public static void main(String[] args) {

		Person p1 = new Artist(112223333, "Pablo", "Picasso", 20);

		/**
		 * Do this first *before* overriding the hashCode and equals methods of Pablo
		 * Calling System.out.println on an object automatically calls its toString()
		 * method
		 * https://stackoverflow.com/questions/8555771/why-is-the-tostring-method-being-called-when-i-print-an-object
		 */
		System.out.println(p1);

		/**
		 * The toString() method for Object class returns a string consisting of the
		 * name of the class of which the object is an instance, the at-sign
		 * character @', and the unsigned hexadecimal representation of the hash code of
		 * the object. It´s not a memory address.
		 */

		Person p2 = new Artist(112223333, "Pablo", "Picasso", 20);

		// test: is p1 ewual in value to p2? (do this first without the overriden
		// hashCode() & equals()

		System.out.println("Is p1 the same value as p2? " + p1.equals(p2));

		System.out
				.println("Do p1 and p2 share the same address in memory? i.e Are they the SAME object? " + (p1 == p2)); // FALSE

		/**
		 * Both equals() method and the == operator are used to compare two objects in
		 * Java. == is an operator and equals() is method. But == operator compares
		 * reference or memory location of objects in a heap, whether they point to the
		 * same location or not
		 */

	}

}
