package com.bridgelabz.algorithmproblems;

public class InsertionSort {
	
	
	
	static<K extends Comparable<K>> void insertionSort(K[] array) {
		
		int length = array.length;
        for (int i = 1; i < length; ++i) {
            K key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key)>0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
		
	}
	
	static<K> void printArray(K[] array) {
		
		for(K word:array) {
			System.out.print(word+" ");
		}
		
	}

	public static void main(String[] args) {
		
		String[] array="banana orange Peache apple Grapes".split(" ");
		insertionSort(array);
		printArray(array);
		

	}

}
