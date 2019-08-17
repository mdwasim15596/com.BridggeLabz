package com.bridgelabz.conditional;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter N Number");
		int n=scanner.nextInt();
		int i=0;
		int poweroftwo=1;
		while(i<=n)
		{
			poweroftwo=2*poweroftwo;
			i=i+1;
			System.out.println(i+" "+poweroftwo);
			
	}
scanner.close();

}
}