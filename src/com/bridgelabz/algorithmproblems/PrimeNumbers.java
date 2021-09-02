package com.bridgelabz.algorithmproblems;

public class PrimeNumbers {
	
	public static boolean primeOrNot(int numberToCheck) {
		if(numberToCheck==0 || numberToCheck==1) {
			return false;
		}
		else
		{
			for(int index=2; index<=numberToCheck/2; index++) {
				if(numberToCheck%index==0) 
					return false;
				
				
			}
			return true;
		}
			 
	      
	}  
	
	public static void printPrimeNumbers(int start, int end) {
		for(int i=start;i<=end;i++) {
			boolean isPrime=primeOrNot(i);
			if(isPrime) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		int startRange=0;
		int endRange=1000;
		printPrimeNumbers(startRange, endRange);

	}

}
