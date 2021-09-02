package com.bridgelabz.algorithmproblems;

public class BubbleSort {
	
	static<K extends Comparable<K>> void bubbleSort(K array[])
    {
        int length = array.length;
        for (int i = 0; i < length-1; i++)
            for (int j = 0; j < length-i-1; j++)
                if (array[j].compareTo( array[j+1])>0)
                {
                   
                    K temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
  
    static<K> void printArray(K arr[])
    {
        int n = arr.length;
        for (K val: arr)
            System.out.print(val + " ");
    }

	public static void main(String[] args) {
		Integer[] array= {23,12,5,90,2,33,45};
		bubbleSort(array);
		printArray(array);

	}

}
