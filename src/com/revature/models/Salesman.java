package com.revature.models;

import java.util.Scanner;

public class Salesman extends Person{
	
	double commission;
	
	// everytime you build a salesman in this game you must program them with a commission
	public Salesman(double commission) {
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
