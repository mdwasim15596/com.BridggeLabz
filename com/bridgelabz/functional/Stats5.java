package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x1,x2,x3,x4,x5;
int n=5;
x1 = Math.random();
x2 = Math.random();
x3 = Math.random();
x4 = Math.random();
x5 = Math.random();


System.out.println(x1);
System.out.println(x2);
System.out.println(x3);
System.out.println(x4);
System.out.println(x5);
	
Utility utility= new Utility();
System.out.println("Min value is :"+utility.stats5(x1, x2, x3, x4, x5));

System.out.println("max value is :"+utility.statsone(x1, x2, x3, x4, x5));
System.out.println("average value is :"+utility.statstwo(x1, x2, x3, x4, x5, n));
 
	}

}
