package com.revature.models;

/*
 * This Person class may be extended by Artist, Student, Programmer...
 * Therefore, since we will never be instantiating a simple "Person" in 
 * our application, we can make it an abstract class.
 */
public abstract class Person {
	
	// https://en.wikipedia.org/wiki/List_of_the_verified_oldest_people#:~:text=The%20oldest%20person%20ever%20whose,122%20years%20and%20164%20days.
	static final int MAX_AGE = 150;
	
	long ssn; 
	String firstName;
	String lastName;
	int age;
	double height;
	double weight;
	
	void introduce() {
		System.out.println("Hi my name is " + this.firstName + " " + this.lastName);
	}
	
}
