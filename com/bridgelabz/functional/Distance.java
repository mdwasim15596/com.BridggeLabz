package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter x:");
double x=scanner.nextInt();
System.out.println("Enter y:");
double y=scanner.nextInt();
Utility utility =  new  Utility();	
	System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " +utility.distance(x, y));
	scanner.close();
	}

}
