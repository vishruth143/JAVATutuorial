package com.java;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int a[] = {-1, 0, 1, 2, 4, 5, 6, 7, 8, 9, 10};
		
		int sum=0, sum1=0;
		
		for (int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
		
		for(int j=-1; j<=10; j++) {
			sum1 += j;
		}
		
		System.out.println(sum1);
		
		System.out.println("The missing number is: "+(sum1-sum));
	}
}