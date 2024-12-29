package com.java;

public class ProgramToReverseFirstAndLastDigit {

	public static void main(String[] args) {
		int num = 1234;
		int power = (int)Math.log10(num);			
		
		int last_digit = num % 10;
		int first_digit = (int)(num / Math.pow(10, power));
		
		int a = (int)(first_digit * Math.pow(10, power));
		int b = num % a;		
		int mid = b / 10;		
		
		System.out.println((int)(last_digit * Math.pow(10, power)) + mid * 10 + first_digit);
	}
}