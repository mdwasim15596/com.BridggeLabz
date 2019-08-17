package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		int c= scanner.nextInt() ;
        
Utility utility = new Utility();
System.out.println("The Square root is"+utility.squareroot(c));
scanner.close();
	}
}
