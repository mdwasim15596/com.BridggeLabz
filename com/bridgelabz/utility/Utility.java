/******************************************************************************
 *  Purpose: Addition of Two Number.
 *
 *  @author  s.M.Wasim
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

public class Utility {

	/**
	 * @param firstNumber
	 *            take input from user.
	 * @param SecondNumber
	 *            take input from user.
	 * @return
	 */
	public int add2integer(int firstNumber, int SecondNumber) {
		int Result = firstNumber + SecondNumber;
		return Result;

	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int inopt(int a, int b, int c) {
		int result = a + b * c;
		return result;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int inop(int a, int b, int c) {
		int result1 = a * b + c;
		return result1;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int ino(int a, int b, int c) {
		int result2 = c + a / b;
		return result2;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int in(int a, int b, int c) {
		int result3 = a % b + c;
		return result3;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double Doubleopt(double a, double b, double c) {
		double result = a + b * c;
		return result;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double Doubleop(double a, double b, double c) {
		double result1 = a * b + c;
		return result1;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double Doubleo(double a, double b, double c) {
		double result2 = c + a / b;
		return result2;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double Double(double a, double b, double c) {
		double result3 = a % b + c;
		return result3;
	}

	public String Leapyear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0
				&& year % 400 == 0) {
			return year + " Leap Year";
		} else {
			return year + "  Not Leap Year";
		}

	}

	public double operationone(double a, double b, double c) {
		double delta = b * b - 4 * a * c;// 2*2-4*2*2=4-8*2=4-16=-12
		double root1 = ((-b + Math.sqrt(delta)) / (2 * a));// -2+(-12)(-12)/(2*2)
		return root1;
	}

	public double operationtwo(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		double root2 = ((-b - Math.sqrt(delta)) / (2 * a));
		return root2;
	}

	public String springoperation(int month, int day) {

		if ((month == 3 && day >= 20 && day <= 31)
				|| (month == 4 && day >= 1 && day <= 30)
				|| (month == 5 && day >= 1 && day <= 31)
				|| (month == 6 && day >= 1 && day <= 20)) {
			return "true";
		} else {
			return "false";
		}
	}

	public double distance(double x, double y) {
		double dist = Math.sqrt(x * x + y * y);
		return dist;

	}

	public int sumoftwodice(int a, int b) {
		int SIDES = 6;
		a = 1 + (int) (Math.random() * SIDES);
		b = 1 + (int) (Math.random() * SIDES);
		int sum = a + b;
		return sum;
	}

	/**
	 * @param x1
	 * @param x2
	 * @param x3
	 * @param x4
	 * @param x5
	 * @return
	 */
	public double stats5(double x1, double x2, double x3, double x4, double x5) {

		double min = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
		return min;

	}

	/**
	 * @param x1
	 * @param x2
	 * @param x3
	 * @param x4
	 * @param x5
	 * @return
	 */
	public double statsone(double x1, double x2, double x3, double x4, double x5) {

		double max = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
		return max;
	}

	/**
	 * @param x1
	 * @param x2
	 * @param x3
	 * @param x4
	 * @param x5
	 * @param n
	 * @return
	 */
	public double statstwo(double x1, double x2, double x3, double x4,
			double x5, int n) {
		double average = (x1 + x2 + x3 + x4 + x5) / n;
		return average;
	}

	public double windchill(double temperature, double speed) {
		double wind = 35.74 + 0.6215 * temperature
				+ (0.4275 * temperature - 35.75) * Math.pow(speed, 0.16);

		return wind;
	}

	public double carloan(double Principal, double Rate, double Year) {
		double n = 12 * Year;
		double r = Rate / (12 * 100);
		double Payment = (Principal * r) / (1 - Math.pow(1 + r, -n));
		return Payment;
	}

	public boolean LeapYear(int Year1) {
		if (Year1 % 4 == 0 || Year1 % 400 == 0 || Year1 % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean dayofweak(int Date1, int Month1, boolean LeapYear) {
		switch (Month1) {
		case 1:
			if (Date1 >= 1 && Date1 <= 31) {
				return true;
			} else {
				return false;
			}
		case 2:
			if (LeapYear) {
				if (Date1 >= 1 && Date1 <= 31) {
					return true;
				} else {
					return false;
				}
			} else {
				if (Date1 >= 1 && Date1 <= 28) {
					return true;
				} else {
					return false;
				}
			}
		case 3:
			if (Date1 > 0 && Date1 <= 31) {
				return true;
			} else {
				return false;
			}
		case 4:
			if (Date1 > 0 && Date1 <= 30) {
				return true;
			} else {
				return false;
			}
		case 5:
			if (Date1 > 0 && Date1 <= 31) {
				return true;
			} else {
				return false;
			}
		case 6:
			if (Date1 > 0 && Date1 <= 30) {
				return true;
			} else {
				return false;
			}
		case 7:
			if (Date1 > 0 && Date1 <= 31) {
				return true;
			} else {
				return false;
			}
		case 8:
			if (Date1 > 0 && Date1 <= 31) {
				return true;
			} else {
				return false;
			}
		case 9:
			if (Date1 > 0 && Date1 <= 30) {
				return true;
			} else {
				return false;
			}
		case 10:
			if (Date1 > 0 && Date1 <= 31) {
				return true;
			} else {
				return false;
			}
		case 11:
			if (Date1 > 0 && Date1 <= 30) {
				return true;
			} else {
				return false;
			}
		case 12:
			if (Date1 > 0 && Date1 <= 31) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public int ValidDate(int Date1, int Month1, int Year1) {
		int y1 = Year1 - (14 - Month1) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = Month1 + 12 * ((14 - Month1) / 12) - 2;
		int d1 = (Date1 + x + 31 * m1 / 12) % 7;
		return d1;
	}

	public double sin(double radian) {
		double s = Math.sin(radian);
		return s;
	}

	public double cos(double radian) {
		double c = Math.cos(radian);
		return c;
	}

	public double tann(double radian) {
		double t = Math.tan(radian);
		return t;
	}

	public double temperatureconversion(double Choice, double temperature) {

		if (Choice == 1) {
			// double temperaure;
			double CelsiustoFahrenheit = (temperature * 9 / 5) + 32;

			return CelsiustoFahrenheit;
		} else if (Choice == 2) {
			double FahrenheittoCelsius = (temperature - 32) * 5 / 9;
			return FahrenheittoCelsius;
		}
		return temperature;

	}

	public double squareroot(int c) {
		double t;
		t = c;
		double epsilon = 1.0e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}

	public void gamingsimulator(int stake, int goal, int trials) {
		int bets = 0;
		int wins = 0;
		int cash = stake;
		for (int i = 0; i < trials; i++) {
			
			
			while (cash > 0 && cash < goal) {
			bets++;	

				if (Math.random()< 0.5) {
					//trials++;
					cash++;
						} else {
							//trials--;
							cash--;
					
						}
			}
			if (cash == goal)
			{
				wins++;
			}
			
			
		}

		System.out.println("Wins =" + wins);
		System.out.println("Percentage of game won " + 100.0*wins / trials);
		System.out.println("Average Bets= "  +  1.0 *bets / trials);
	}
public int binary1( int dectobinary)

{	

	return ((dectobinary & 0x0F) << 4 | (dectobinary & 0xF0) >> 4); 
}
public void Prime(int n) 
{

	int num;
	String primeNumbers="";
       for (int i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to "+n+" are :");
       System.out.println(primeNumbers);

}
public int CalculateFactorial(int number) {
	int fact=1;
	for (int i=1;i<=number;i++) {
		fact*=i;
	}
	return fact;
}
public void Repeated(int[] arr, int n)
{

	for(int i=0;i< arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
			System.out.println("Repeated = "+arr[j]);		
		    }
			
		}
	}		
	

}
public String[] ReverseStringArray(String[] namesArray, int start, int lengthOfArray) {

	// for reversing the nameArray

	String temp;
	while (start < lengthOfArray) {
		temp = namesArray[start];
		namesArray[start] = namesArray[lengthOfArray];
		namesArray[lengthOfArray] = temp;
		start++;
		lengthOfArray--;
	}
	return namesArray;
}
public double CalculateAngleX(int x) {
	
	return x%(2*180);
	
}
public void PrintSinXSeries(double angleX, int noOddSeries) {
	
	int count=1;

	System.out.print("Sin("+angleX+") = ");
	System.out.print(angleX +" - ");
	for(int i=3;i<=noOddSeries;) {
		if(count%2!=0) {
			System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
			if(i!=noOddSeries) {
				System.out.print(" + ");
			}
			
			count++;
			
		}else {
			System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
			if(i!=noOddSeries) {
				System.out.print(" - ");	
			}
			count++;
		}
		i=i+2;
		
	}
	
	
}
public void PrintCosXSeries(double angleX, int noEvenSeries) {
	int count=1;
	
	System.out.print("Sin("+angleX+") = ");
	System.out.print( "1 - ");
	for(int i=2;i<=noEvenSeries;) {
		if(count%2==0) {
			System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
			if(i!=noEvenSeries) {
				System.out.print(" + ");
			}
			
			count++;
			
		}else {
			System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
			if(i!=noEvenSeries) {
				System.out.print(" - ");	
			}
			count++;
		}
		i=i+2;
		
	}
	
}
}
