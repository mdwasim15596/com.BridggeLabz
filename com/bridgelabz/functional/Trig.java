package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
System.out.println("Enter a degree");
		double degree= scanner.nextDouble();
		double radian =Math.toRadians(degree);
Utility utility= new Utility();
	System.out.println(" Degree is "+degree);
	System.out.println("sin(" + degree+ ") = " + utility.sin(radian));
	System.out.println("cos(" + degree + ") = " + utility.cos(radian));
	System.out.println("Tan(" + degree + ") = " + utility.tann(radian));
    
	scanner.close();

	}

}
