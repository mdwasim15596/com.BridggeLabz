/*********************************************************
 * Purpose: Arithmetic Equation
 * author :wasim
 * Date   :8/8/19 
 ********************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOpt {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value a:");
		a=scanner.nextInt();
		System.out.println("Enter the value b:");
		b=scanner.nextInt();
		System.out.println("Enter the value c:");
		c=scanner.nextInt();
		int result=utility.inopt(a, b, c);
		int result1=utility.inop(a, b, c);
		int result2=utility.ino(a, b, c);
		int result3=utility.in(a, b, c);
		System.out.println("a+b*c:"+result);
		System.out.println("a*b+c:"+result1);
		System.out.println("c+a/b:"+result2);
		System.out.println("a % b + c:"+result3);
		scanner.close();
		
	}

}
