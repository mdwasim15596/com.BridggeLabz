package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		int Decimalnumber,mod;
		int dectobinary;
		int resultofswapnibbles;
		String binary="";
		Utility utility = new Utility();
		System.out.println("Enter Number:");
		Scanner scanner = new Scanner(System.in);
		Decimalnumber= scanner.nextInt();
		dectobinary=Decimalnumber;
	if(Decimalnumber >255)
	{
		System.out.println("Enter the Number between 1 to 255:");
	}
	else
	{
		while(Decimalnumber>0)
		{
			mod=Decimalnumber%2;
			/*if(mod==1)
			{ 
				count++;
			}*/
		  	binary=mod +""+ binary;
			Decimalnumber=Decimalnumber/2;
		} 
		System.out.println("binary number is:"+binary);
		//System.out.println(count);
		resultofswapnibbles=utility.binary1(dectobinary);
	System.out.println("Result of swapnibbles is:"+resultofswapnibbles);
	}
	
	}

}
