package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double temperature;
double speed;
Scanner scanner= new Scanner(System.in);
System.out.println("Enter the Temperature:");
temperature=scanner.nextDouble();
System.out.println("Enter the Speed:");
	speed=scanner.nextDouble();
Utility utility= new Utility();
System.out.println("Temperature is:"+temperature);
System.out.println("Speed is:"+speed);
System.out.println("Wind is:"+utility.windchill(temperature, speed));
scanner.close();
	}

}
