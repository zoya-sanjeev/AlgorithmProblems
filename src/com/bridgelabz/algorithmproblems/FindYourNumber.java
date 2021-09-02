package com.bridgelabz.algorithmproblems;

import java.util.Scanner;

public class FindYourNumber {
	static Scanner sc=new Scanner(System.in);
	
	public static double log2(int N) {
		double result = (Math.log(N) / Math.log(2));
        return result;
	}
	
	static int findNumber(int low, int high)
    {
       if(low==high)
    	   return low;
       int mid=low+high/2;
       System.out.println("Number Between "+low+" and "+high+"(y=1/n=0)");
       int choice=sc.nextInt();
       switch(choice) {
       case 1: return findNumber(low,mid);
		case 0: return findNumber(mid+1,high);
		default: System.err.println("Invalid Response");
		System.exit(0);
		return -1;
       }
    }

	public static void main(String[] args) {
		int N=Integer.parseInt(args[0]);
		
		if(log2(N) - Math.floor(log2(N))!=0) {
			System.err.println("N must be a power of 2");
			System.exit(0);
		}
		
		System.out.println("Think of a number between 0 and "+(N-1));
		int number = findNumber(0,N-1);
		System.out.println(number);
		System.out.println("Enter 1 for YES and 0 for NO");

	}

}
