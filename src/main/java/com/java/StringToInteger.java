package com.java;

import java.util.Arrays;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(strToInt("1234"));
		System.out.println("-567");
	}
	
	public static int strToInt(String s) {		
		char[] char_arr = s.toCharArray();
//		System.out.println(Arrays.toString(char_arr));
//		System.out.println(char_arr.length);
		int i=0;
		int num = 0;
		Boolean isNegative = false;
		
		if(char_arr[0] == '-') {
			isNegative = true;
			i=1;
		}
		
		for(;i<char_arr.length;i++) {
			int n = char_arr[i] - 0;
			num = num * 10 + n;		
		}
		
		return isNegative ? -num : num;
	}
}
