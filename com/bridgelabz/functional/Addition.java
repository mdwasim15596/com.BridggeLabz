
package com.bridgelabz.functional;
//package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Addition {
public static void main(String[] args) 
	{
		int FirstNumber,SecondNumber;
		Utility utility = new Utility();
Scanner scanner= new Scanner(System.in);
System.out.println("Enter a FirstNumber:");
FirstNumber=scanner.nextInt();
System.out.println("Enter a SecondNumber:");
SecondNumber=scanner.nextInt();
int Result=utility.add2integer(FirstNumber,SecondNumber);
System.out.println("Result:"+Result);
scanner.close();

	}


}
