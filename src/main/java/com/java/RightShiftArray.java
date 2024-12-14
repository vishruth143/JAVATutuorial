package com.java;

import java.util.Arrays;

public class RightShiftArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int n =3;
		
		int length = arr.length;		
		int[] rotated = new int[length];
		n = n % length;
		
		for(int i=0; i<n; i++) {
			rotated[i] = arr[length-n+i];
		}
		
		for(int i=n; i<length; i++) {
			rotated[i] = arr[i-n];
		}
		
		System.out.println(Arrays.toString(rotated));
	}
}
