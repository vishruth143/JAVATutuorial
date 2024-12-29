package com.java;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {5,6,1,2,3};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
		for(int k=0; k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
