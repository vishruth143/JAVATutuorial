package com.java;

public class StringArrayToString {

	public static void main(String[] args) {
		String[] arr = {"t","r","v"};
		String result = "";
		
		for(String ch:arr) {
			result += ch;
		}		
		System.out.println(result);
	}
}
