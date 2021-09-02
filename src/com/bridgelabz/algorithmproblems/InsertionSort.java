package com.bridgelabz.algorithmproblems;

public class InsertionSort {
	
	static String[] array="banana orange Peache apple Grapes".split(" ");
	
	static void insertionSort(String[] array) {
		
		int length = array.length;
        for (int i = 1; i < length; ++i) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key)>0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
		
	}
	
	static void printArray(String[] array) {
		
		for(String word:array) {
			System.out.print(word+" ");
		}
		
	}

	public static void main(String[] args) {
		
		insertionSort(array);
		printArray(array);
		

	}

}
