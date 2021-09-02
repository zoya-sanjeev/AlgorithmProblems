package com.bridgelabz.algorithmproblems;

import java.util.Scanner;


public class BinarySearch {
	static Scanner sc=new Scanner(System.in);
	static String[] words="apple banana cat dog elephant frog".split(" ");
	
	public static<K extends Comparable<K>> boolean binarySearch(K key) {
		int length=words.length;
		int low=0;
		int mid=length/2 ;
		int high=length-1;;
		int compare;
		while(low <=high) {
			mid=low+high/2;
			compare=key.compareTo((K) words[mid]);
			if(compare==0) {
				return true;
			}
			else if(compare<0) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
				
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter word to be searched");
		String key=sc.next();
		boolean found=binarySearch(key);
		if(found)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
	}

}
