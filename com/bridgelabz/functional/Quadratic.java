package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,c;
Utility utility = new Utility(); 
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of a:");
a=scanner.nextDouble();
System.out.println("Enter number of b:");
b=scanner.nextDouble();
System.out.println("Enter number of c:");
c=scanner.nextDouble();
double root1=utility.operationone(a, b, c);
double root2=utility.operationtwo(a, b, c);
System.out.println("The roots of quadratic equation are :"+root1+"and"+root2);
scanner.close();

	}

}
