package com.java;

import java.util.Arrays;

public class MoveAllZeroesToTheEndOfAnArray {

	public static void main(String[] args) {
		int[] arr = {0, 1, 12, 0, 5, 6};
		int[] result = moveAllZeroesToEnd(arr, arr.length);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] moveAllZeroesToEnd(int[] a, int len) {	
		
		int index = 0; // Pointer for placing non-zero elements
		
		// Move all non-zero elements to the front
		for(int i=0; i<len;i++) {
			if(a[i] != 0) {
				a[index++] = a[i];
			}
		}
		
		// Fill the remaining positions with zeroes
		while(index<len) {
			a[index++] = 0;
		}
		
		return a;		
	}
}