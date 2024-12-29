package com.java;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 2, 1};
		Set<Integer> store = new HashSet<Integer>();
		
		for (int i=0; i<arr.length; i++) {			
			if(store.add(arr[i])==false) {
				System.out.println("The duplicate element is: " + arr[i]);
			}			
		}
	}
}
