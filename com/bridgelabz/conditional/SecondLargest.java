package com.bridgelabz.conditional;

public class SecondLargest
{

	public static void main(String[] args) {

        int arr[]= {8,7,6,2,0,1};
        int larg = arr[0];
        int secondlarg = arr[0];
        int min = arr[0];
        int secmin = arr[0];
         
         for(int i=0; i<=arr.length-1;i++)
         {
        	System.out.println(arr[i]);
         }         // to find Second largest
        
         for(int i=0;i<=arr.length-1;i++)
         {
        	 if(arr[i]>larg)
        	 {
        		secondlarg =larg;
        		larg = arr[i];
        	 }
        	 else if(arr[i]>secondlarg)
        	 {
        		 secondlarg = arr[i];
        	 }
        		
         }
         // to find second min
         for(int i =0;i<=arr.length-1;i++)
         {
        	 if(arr[i]<min)
        	 {
        		 secmin = min;
        		 min = arr[i];
        	 }
        	 else if(arr[i]<secmin)
        	 {
        		 secmin = arr[i];
        	 }
        
	     }
         System.out.println("Second largest : " +secondlarg);
         System.out.println("Second min : " +secmin);
	}
}