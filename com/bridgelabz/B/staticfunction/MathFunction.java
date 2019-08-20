package com.bridgelabz.B.staticfunction;

import java.util.Scanner;

import com.bridgelabz.B.StaticUtility.mathFunction.UtilityMathFunction;

public class MathFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb;
		double radiun;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no");;
		numb = scanner.nextInt();
		System.out.println("Enter angle");;
		radiun = scanner.nextDouble();

		UtilityMathFunction utility = new UtilityMathFunction();
		//Harmonic number
		System.out.print("Harmonic number is : ");
		utility.PrintHarmonic(numb);
		
		//sin of angle
		System.out.println("Sin angle =");
		System.out.println(utility.findSin(radiun));
		//cos of angle
		System.out.println("Cos angle =");
		System.out.println(utility.findCos(radiun));

		//binary
		
		utility.Binary(numb);
		//square root using newton
		System.out.print("Sqaure root using newtons method is = ");
		System.out.println(utility.findSquareRootUsingNewtonsMethod(numb));
		
		//Prime number
		System.out.println("Number " + numb+ "is Prime = ");
		System.out.print(utility.isPrime(numb));
		
		System.out.println("Factorial =");
	
		System.out.print(utility.CalculateFactorial(numb));
		scanner.close();
	}

}