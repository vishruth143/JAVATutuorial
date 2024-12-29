package com.java;

public class SwapTwoStringWithoutInbuiltFunction {

	public static void main(String[] args) {
		// Initialize two strings to be swapped
		String s1 = "Hello";
		String s2 = "World";
		
		// Print the strings before swapping
		System.out.println("Before Swap: ");
		System.out.println("s1: "+s1+", s2: "+s2);
		
		// Combine both strings into one
        // This allows us to store the values of both strings without using a temporary variable
		String combinedString = s1+s2;
		
		// Calculate the total length of the combined string
		int combinedString_length = combinedString.length();		
		
		// Swap the strings using substring function
		s1 = combinedString.substring(combinedString_length-s1.length());		
		s2 = combinedString.substring(0, combinedString_length-s1.length());
		
		// Print the strings after swapping
		System.out.println("After Swap: ");
		System.out.println("s1: "+s1+", s2: "+s2);
	}
}