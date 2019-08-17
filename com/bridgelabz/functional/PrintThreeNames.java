/******************************************************************************
 *  Purpose: Print three Names
 *
 *  @author  Wasim
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1,name2,name3;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the  FirstName ");
name1=scanner.next();
System.out.println("Enter the SecondName ");
name2=scanner.next();
System.out.println("Enter the ThirdName");
name3=scanner.next();
System.out.println("HI"+name3+","+name2+ " and "+name1);
scanner.close();
	}

}
