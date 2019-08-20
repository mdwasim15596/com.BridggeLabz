package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeN {
	public static void main(String args[])
	{
	int n;
	Scanner scanner = new Scanner(System.in);
	Utility utility = new Utility();
	System.out.println("Enetr a number");
	n=scanner.nextInt();
	int fact=1;
	for(int i=2;i*i<=n;i++) {
	utility.Prime(i);

		{
			
			fact=utility.CalculateFactorial(i);
			System.out.println("Factorial of number "+i+" is "+fact);
			//fact=1;
		}
		
	}
	
	scanner.close();
}

}