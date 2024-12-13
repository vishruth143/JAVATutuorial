package com.java;
public class ReverseString {
	public static void main(String[] args) {
		String s = "Selenium";
		
//		int l = s.length();
//		String rev = "";
//		
//		for (int i=l-1;i>=0;i--) {
//			rev += s.charAt(i);
//		}		
//		System.out.println(rev);	
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}
}
