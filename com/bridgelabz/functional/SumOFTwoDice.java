package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOFTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
System.out.println("Enter a");
int a=scanner.nextInt();
System.out.println("Enter b");
int b=scanner.nextInt();
Utility utility= new Utility();
System.out.println("SumOFTwoDice IS:"+utility.sumoftwodice(a, b));
scanner.close();

	}

}
