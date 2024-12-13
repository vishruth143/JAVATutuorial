package com.java;

public class FinallyConcept {

	public static void main(String[] args) {
		test();	
	}
	
	public static void test() {
		try {
			System.out.println("Inside test method");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("Inside catch block");			
		}finally {
			System.out.println("Inside finally block");
		}
	}
}
