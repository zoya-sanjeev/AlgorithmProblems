package com.bridgelabz.algorithmproblems;
import java.util.*;
import java.io.*;
public class AnagramDetection {
	
	static int NO_OF_CHARS = 256;
	
	
	static boolean checkAnagram(String stringOne,
	                          String stringTwo)
	{
	  
		char[] str1=stringOne.toCharArray();
	   char[] str2=stringTwo.toCharArray();
	   Arrays.sort(str1);
	   Arrays.sort(str2);
	   str1.toString();
	   str2.toString();
	   if((new String(str1)).equals(new String(str2)))
		   return true;
	   else
		   return false;
	}

	public static void main(String[] args) {
		
		
		String string1="arc";
		String string2="car";
		String string3="cat";
		if(checkAnagram(string1, string2))
			System.out.println(string1+" and "+string2+" are anagrams");
		else
			System.out.println(string1+" and "+string2+" are not anagrams");
		
		if(checkAnagram(string1, string3))
			System.out.println(string1+" and "+string3+" are anagrams");
		else
			System.out.println(string1+" and "+string3+" are not anagrams");
	}

}
