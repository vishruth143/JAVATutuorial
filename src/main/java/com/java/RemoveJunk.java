package com.java;

public class RemoveJunk {
	public static void main(String[] args) {
		String s = "!@#$%^&()_+-= string 01234567890";
		
		//Regular Expression [^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}
