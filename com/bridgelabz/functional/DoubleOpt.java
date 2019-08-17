package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		Scanner scanner = new Scanner(System.in);
		Double a,b,c;
		System.out.println("Enter the value a:");
		a=scanner.nextDouble();
		System.out.println("Enter the value b:");
		b=scanner.nextDouble();
		System.out.println("Enter the value c:");
		c=scanner.nextDouble();
		double result=utility.Doubleop(a, b, c);
		double result1=utility.Doubleo(a, b, c);
		double result2=utility.Double(a, b, c);
		double result3=utility.Double(a, b, c);
		System.out.println("a+b*c:"+result);
		System.out.println("a*b+c:"+result1);
		System.out.println("c+a/b:"+result2);
		System.out.println("a % b + c:"+result3);
		scanner.close();
		
	}



	
}
