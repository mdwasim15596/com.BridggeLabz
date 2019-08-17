package com.bridgelabz.functional;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
System.out.println("Enter the choice:");	
double Choice=scanner.nextDouble();
Utility utility= new Utility();
System.out.println("Enter the Temperature");
double temperature= scanner.nextDouble();
System.out.println(utility.temperatureconversion(Choice, temperature));

	}

}
