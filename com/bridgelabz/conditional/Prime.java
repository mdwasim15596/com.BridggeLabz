package com.bridgelabz.conditional;

import java.util.Scanner;

public class Prime {

		 public static void main(String[] args) { 
		     Scanner scanner = new Scanner(System.in);  
		     System.out.println("Enter number:");
			 long n = scanner.nextInt();
		        boolean isPrime = true;
		        if (n < 2) isPrime = false;
for (long factor = 2; factor*factor <= n;)
{
		            if (n % factor == 0)
		            {
		                isPrime = false;
		            }
		                break;
		            }
		       	if (isPrime)
		        	{
		        	System.out.println(n + " is prime");
		        	}
		        	else 
		        	{
		        		System.out.println(n + " is not prime");
		    
		        	}
		        


}
}
