package com.revature.models;

public class Salesman extends Person{
	
	double commission;
	
	// every time you build a salesman in this game you must program them with a commission
	public Salesman(long ssn, String firstName, String lastName, int age, double commission) {
		super(ssn, firstName, lastName, age);
		this.commission = commission;
	}

	// this method returns a profit in based on the amount of things the salesman has sold
	// returns commission * numOfThings
	double profit(int numOfThingsSold) {
		
		double totalMoneyMade = numOfThingsSold * commission;
		
		System.out.println("My name is " + this.firstName);
		
		return totalMoneyMade;
		
	}

}
