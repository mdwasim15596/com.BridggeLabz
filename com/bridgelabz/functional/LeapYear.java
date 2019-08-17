package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
Utility utility= new Utility();
System.out.println("Enter the Year:");
int year=scanner.nextInt();
while(year<1582)
{
	System.out.println("Enter  a year grater than 1582");
	year=scanner.nextInt();
}
System.out.println(utility.Leapyear(year));
	scanner.close();
				}
}

