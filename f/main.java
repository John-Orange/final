package com.Final;

import java.util.Scanner;

public class main{

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Paycheck paycheck = new Paycheck();
		
		System.out.println("Please enter the hours:");
		double hours = scnr.nextDouble();
		
		System.out.println("please enter the rate:");
		double rate = scnr.nextDouble();
		
		Paycheck paycheck1 = new Paycheck(hours, rate);
		
		paycheck1.printInfo();
		

	}

}
