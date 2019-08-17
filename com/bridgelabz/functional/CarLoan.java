package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Principal Loan:");
double principal=scanner.nextInt();
System.out.println("Enter the Rate:");
int Rate=scanner.nextInt();	
System.out.println("Enter the Year:");
int Year=scanner.nextInt();
Utility utility = new Utility();
	System.out.println("Payment is:"+utility.carloan(principal, Rate, Year));
	scanner.close();
	
	}

}
