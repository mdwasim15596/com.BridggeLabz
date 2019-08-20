package com.bridgelabz.B.StaticUtility;

//import java.lang.reflect.Array;

//import java.awt.List;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;
//import java.util.Random;
public class UtilityStFunction {
	
	public static boolean anagram(char[] s1,char[] s2) {
     int n1 = s1.length; 
     int n2 = s2.length; 

     // If length of both strings is not same, 
     // then they cannot be anagram 
     if (n1 != n2) 
         return false; 

     // Sort both strings 
     Arrays.sort(s1); 
     Arrays.sort(s2); 

     // Compare sorted strings 
     for (int i = 0; i < n1; i++) 
         if (s1[i] != s2[i]) 
             return false; 

     return true; 
 }
	public static boolean palindrome(String s1)
	{
		String rev="";
		int n1=s1.length()-1;
		for(int i=n1;i>0;i--)
		
			rev=rev+s1.charAt(i);
		if(s1.equals(rev))
			return true;
		else
			return false;
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	
	private static void swap1(char[] a, int i, int j) {
		char ch = a[i];
		a[i] = a[j];
		a[j] = ch;
	}
	static List<String> listIterative = new ArrayList<String>();

	public static void permutations(String s) {
		// convert string to a character array (Since String is immutable)
		char[] chars = s.toCharArray();

		// Weight index control array
		int[] p = new int[s.length()];

		// i, j represents upper and lower bound index resp. for swapping
		int i = 1, j = 0;

		// Print given string, as only its permutations will be printed later
		System.out.print(s);
		listIterative.add(s);
		while (i < s.length()) {
			if (p[i] < i) {
				// if i is odd then j = p[i], otherwise j = 0
				j = (i % 2) * p[i];

				// swap(a[j], a[i])
				swap1(chars, i, j);

				// Print current permutation
				System.out.print(" " + String.valueOf(chars));
				listIterative.add(String.valueOf(chars));
				p[i]++; // increase index "weight" for i by one
				i = 1; // reset index i to 1
			}
			// otherwise p[i] == i
			else {
				// reset p[i] to zero
				p[i] = 0;

				// set new index value for i (increase by one)
				i++;
			}
		}
	}
	static List<String> listRecursive = new ArrayList<String>();

	public static void permute(String s1, int low, int high) {
		if (low == high) {
			System.out.println(s1);
			listRecursive.add(s1);
		} else {
			for (int i = low; i <= high; i++) {
				s1 = swap(s1, low, i);
				
				permute(s1, low + 1, high);
				s1 = swap(s1, low, i);
				
			}
		}
		
	}
	public static void compareList()
	{
		Collections.sort(listIterative);
		Collections.sort(listRecursive);
		if((listIterative).equals(listRecursive)){
			System.out.println("lists are equal");
		}
		else
		{
		System.out.println("the lists are not equal");	
		}
	}
	public static int DayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
}
	public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        if  (year % 400 == 0) return true;
        return false;
}
}