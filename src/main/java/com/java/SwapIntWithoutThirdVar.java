package com.java;

public class SwapIntWithoutThirdVar {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		
//		//1. With using third var
//		int t;
//		t = x;
//		x = y;
//		y = t;
//		
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);	
		
//		//2. Without using third variable: using + operator
//		x = x+y;
//		y = x-y;
//		x = x-y;
//		
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);	
		
//		//3. Without using third variable: using * operator
//		x = x*y;
//		y = x/y;
//		x = x/y;
//		
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);	
		
		//4. Without using third variable: using ^ operator
		x = x ^ y; 
		y = x ^ y; 
		x = x ^ y;
				
		System.out.println("x = "+x);
		System.out.println("y = "+y);	
	}
}
