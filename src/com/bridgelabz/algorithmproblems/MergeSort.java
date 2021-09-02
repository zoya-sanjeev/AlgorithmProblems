package com.bridgelabz.algorithmproblems;

public class MergeSort {
	
	static<K extends Comparable<K>> void  merge(K array[], int start, int mid, int end) {

		K temp[] =(K[]) new Object[end - start + 1];
		int i = start, j = mid+1, k = 0;

		while(i <= mid && j <= end) {
			if(array[i].compareTo(array[j])<=0) {
				temp[k] = array[i];
				k += 1; i += 1;
			}
			else {
				temp[k] = array[j];
				k += 1; j += 1;
			}
		}

		while(i <= mid) {
			temp[k] = array[i];
			k += 1; i += 1;
		}

		while(j <= end) {
			temp[k] = array[j];
			k += 1; j += 1;
		}

		for(i = start; i <= end; i += 1) {
			array[i] = temp[i - start];
		}
	}


	static<K extends Comparable<K>> void mergeSort(K Arr[], int start, int end) {

		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid+1, end);
			merge(Arr, start, mid, end);
		}
	}
	static<K> void printArray(K[]array) {
		for(K word : array ) {
			System.out.print(word+" ");
		}
	}

	public static void main(String[] args) {
		String[] array="banana apple frog cat giraffe dog".split(" ");
		mergeSort(array,0,array.length-1);
		printArray(array);

	}

}
