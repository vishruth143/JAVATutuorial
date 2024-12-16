package com.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 1, 2, 3, 4};
		Set<Integer> dataset = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			dataset.add(arr[i]);
		}		
		System.out.println(dataset);			
	}
}
