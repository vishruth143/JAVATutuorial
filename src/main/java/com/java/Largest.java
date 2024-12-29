package com.java;

public class Largest {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 10};
		int largest = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);		
	}
}