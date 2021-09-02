package com.bridgelabz.algorithmproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
	static Scanner sc=new Scanner(System.in);
	
	static String[] string="apple banana cat dog elephant fox giraffe".split(" ");;
	static List<String> words= Arrays.asList(string);
	
	public static boolean binarySearch(String key) {
		int length=words.size();
		int low=0;
		int mid=length/2 ;
		int high=length-1;;
		int compare;
		while(low <=high) {
			mid=low+high/2;
			compare=key.compareTo(words.get(mid));
			if(compare==0) {
				return true;
			}
			else if(compare<0) {
				high=mid-1;
			}
			else {
				low=mid;
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
