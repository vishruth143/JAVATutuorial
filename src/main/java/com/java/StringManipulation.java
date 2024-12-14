package com.java;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {
		String str = "The rains have started here selenium";
		String str1 = "The rains Have started here selenium";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		
		int firstOccurrence = str.indexOf('s');
		System.out.println(firstOccurrence); //1st Occurance of s
		
		int secondOccurrence = str.indexOf('s', firstOccurrence + 1);
		System.out.println(secondOccurrence); //2nd Occurance of s
		
		int thirdOccurance = str.indexOf('s', secondOccurrence + 1);
		System.out.println(thirdOccurance); 
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));
		
		//String comparison
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(0, 9));
		
		//trim
		String s = "  Hello World  ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String date = "01-01-20204";
		System.out.println(date.replace("-", "/"));
		
		//split
		String test = "Hello_World_Selenium";
		String[] stringval = test.split("_");
		System.out.println(Arrays.toString(stringval));
		for(int i=0; i<stringval.length;i++) {
			System.out.println(stringval[i]);
		}
		
		//concat
		String s2 = "cares";
		System.out.println(s2.concat("s"));
		
		String x="Hello";
		String y="World"; 
		int a=100;
		int b=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
	}
}
