package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GamlingSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the Stake:");
		int stake=scanner.nextInt();
		System.out.println("Enter the Goal:");
	int goal=scanner.nextInt();
	System.out.println("Enter the Trials:");
	int trials=scanner.nextInt();
	
	Utility utility= new Utility();
	utility.gamingsimulator(stake, goal, trials);
	
	scanner.close();
	}

}
