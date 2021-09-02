package com.bridgelabz.algorithmproblems;

public class PrimeNumbers {
	
	public static boolean checkPalindrome(int num){
		int reverse=0;
		int number=num;
		while(number>0) {
			int remainder=number % 10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		if(reverse==num)
			return true;
		else
			return false;
		
	}
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
			if(primeOrNot(i) && checkPalindrome(i))
				System.out.println(i+" ");
			
		}
	}

	public static void main(String[] args) {
		int startRange=0;
		int endRange=1000;
		printPrimeNumbers(startRange, endRange);

	}

}
