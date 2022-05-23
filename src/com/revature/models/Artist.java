package com.revature.models;

public class Artist extends Person{

	// we will be required to add this after adding a constructor to the Person class
	public Artist(long ssn, String firstName, String lastName, int age) {
		super(ssn, firstName, lastName, age);
	}
	
	/*
	 * You can't generate the hashCode() & equals() methods from this class.
	 * You must do so from the parent class: Person
	 */
	
}
