package com.revature.models;

/*
 * This Person class may be extended by Artist, Student, Programmer...
 * Therefore, since we will never be instantiating a simple "Person" in 
 * our application, we can make it an abstract class.
 */
public abstract class Person {
	
	// https://en.wikipedia.org/wiki/List_of_the_verified_oldest_people#:~:text=The%20oldest%20person%20ever%20whose,122%20years%20and%20164%20days.
	static final int MAX_AGE = 150;
	
	// These represent STATE - properties of an object that can change
	long ssn; 
	String firstName;
	String lastName;
	int age;
	
	
	public Person(long ssn, String firstName, String lastName, int age) {
		super(); // inherits from the parent class (which in this case is the Object class)
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	void introduce() {
		System.out.println("Hi my name is " + this.firstName + " " + this.lastName);
	}


	/**
	 * Demonstrate equality in the TesterApp.java class first before overriding
	 * these values.
	 */
	
	// hashCode is supposed to generate a unique identifier for each instance of the class 
	// based on the values of its properties
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (ssn ^ (ssn >>> 32));
		return result;
	}


	// equals() compares this instance to another instance to see if they are equal or not
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (ssn != other.ssn)
			return false;
		return true;
	}
	
	
}
