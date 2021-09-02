package com.bridgelabz.algorithmproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPermutation {
	static List<String> permuteListRecursive = new ArrayList<String>();
	private static void swap(char[] letters, int first, int second) {
		char temp = letters[first];
		letters[first] = letters[second];
		letters[second] = temp;
	}
	
	private static void permutationsRecursive(char[] chars, int currentIndex) {
		if (currentIndex == chars.length - 1) {
			permuteListRecursive.add(String.valueOf(chars));
		}

		for (int i = currentIndex; i < chars.length; i++) {
			swap(chars, currentIndex, i);
			permutationsRecursive(chars, currentIndex + 1);
			swap(chars, currentIndex, i);
		}
	}

	private static void permutationsIterative(char[] chars, int currentIndex) {
		String word = new String(chars);
		if (word == null || word.length() == 0) {
			return;
		}
		List<String> permuteList = new ArrayList<String>();
		permuteList.add(String.valueOf(word.charAt(0)));
		for (int index1 = 1; index1 < word.length(); index1++) {
			for (int index2 = permuteList.size() - 1; index2 >= 0; index2--) {
				String currentString = permuteList.remove(index2);
				for (int index3 = 0; index3 <= currentString.length(); index3++) {
					permuteList.add(
							currentString.substring(0, index3) + word.charAt(index1) + currentString.substring(index3));
				}

			}
		}
		Collections.sort(permuteList);
		System.out.println(permuteList);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String word = scanner.nextLine();
		char[] letters = word.toCharArray();
		scanner.close();

		permutationsRecursive(letters, 0);
		System.out.println(permuteListRecursive);
		permutationsIterative(letters, 0);
	}
}
