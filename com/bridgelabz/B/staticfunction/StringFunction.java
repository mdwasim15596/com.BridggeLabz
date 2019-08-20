package com.bridgelabz.B.staticfunction;

import java.util.Scanner;
import java.util.ArrayList;

import com.bridgelabz.B.StaticUtility.UtilityStFunction;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1;
String s2;
UtilityStFunction utility =new  UtilityStFunction();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first String:");
s1=scanner.nextLine();
int max=s1.length()-1;
System.out.println("Enter Second String:");
s2=scanner.nextLine();
char[]a=s1.toCharArray();
char[]b=s2.toCharArray();

if (utility.anagram(a, b)) 
{
       System.out.println("The two strings are"
                          + " anagram of each other"); 
}
   else
   {
       System.out.println("The two strings are not"
                          + " anagram of each other");
   }


	if(utility.palindrome(s1))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}

	System.out.println("Permutations using iterative is");
	utility.permutations(s1);
	
	
	System.out.println("Permutations using recursive  are");
	utility.permute(s1, 0, max);	
	
	 scanner.close();
	 }

}