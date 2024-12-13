package com.java;

public class Smallest {

	public static void main(String[] args) {
		int a[] = {2, 3, 4, 5, 10, 6, 1};
		int smallest = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		System.out.println(smallest);		
	}
}

