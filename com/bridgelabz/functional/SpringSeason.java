package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month/*Integer.parseInt(args[1])*/;
int day/*Integer.parseInt(args[2])*/;

Utility utility= new Utility();
Scanner scanner =new Scanner(System.in);
System.out.println("Enter a Month");
month=scanner.nextInt();
System.out.println("Enter a day");
day=scanner.nextInt();
System.out.println(utility.springoperation(month, day));
	
	scanner.close();
	}

}
