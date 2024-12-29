package com.java;

public class PrintAllPermutationOfString {

	public static void stringPermutation(String input, String result) {
		
		if(input.length()==0) {
			//If the string is empty
			System.out.println(result + " ");
			return;
		}	
		
		for(int i=0; i<input.length(); i++) {
			//ith character of the string
			char ch = input.charAt(i);
			
			//Rest of the string
			String rest = input.substring(0, i) + input.substring(i+1);
			
			//Recursive call
			stringPermutation(rest, result+ch);
			
		}
	}
	
	
	public static void main(String[] args) {
		String inputString = "ab";
		stringPermutation(inputString, "");
	}

}
