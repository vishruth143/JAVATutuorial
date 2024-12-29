package com.java;

public class SumUpArray {

	public static void main(String[] args) {
		int[] input_arr = {1, 2, 3, 4, 5};
		System.out.println("Sum: " + sumUpArray(input_arr));
	}
	
	public static int sumUpArray(int[] arr) {		
		int sum = 0;
		for(int num:arr) {
			sum += num;
		}
		return sum;
	}
}