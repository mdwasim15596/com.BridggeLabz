package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("year");
		int Year1 = scanner.nextInt();
		System.out.println("Enter the Month:");
		int Month1 = scanner.nextInt();
		System.out.println("Date");
		int Date1 = scanner.nextInt();
		boolean LeapYear,ValidDate;
	Utility utility= new Utility(); 
	LeapYear=utility.LeapYear(Year1);
	ValidDate=utility.dayofweak(Date1, Month1, LeapYear);
	if(ValidDate)
	{
		int  d1=utility.ValidDate(Date1, Month1, Year1);
			switch(d1)
			{
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			
			}
	}
		else
		{
			System.out.println("InvlidDate:");
		}
	scanner.close();
			}
	}


		    	