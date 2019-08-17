package com.bridgelabz.conditional;

import java.util.Scanner;

public class HarmoniacNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the i:");
		//double i=scanner.nextDouble();
		System.out.println("Enter the Number:");
		int number=scanner.nextInt();
		 double sum=0.0;
		for(int i=1;i<=number;i++)
		{
			 sum+=1.0/i;}
			System.out.println("Harmoniac Number"+sum);
		
			scanner.close();		
	}


}
