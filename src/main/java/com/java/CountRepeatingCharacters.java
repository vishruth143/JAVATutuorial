package com.java;

public class CountRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(countRepeatingCharacters("aaabbbacfwww"));
	}

	public static String countRepeatingCharacters(String input) {
		StringBuilder output = new StringBuilder();

		int count = 1; // Start with the first character
		char currentChar = input.charAt(0);

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == currentChar) {
				count++; // Increment count if the current character repeats
			} else {
				// Append the character and count (if greater than 1)
				output.append(currentChar);
				if (count > 1) {
					output.append(count);
				}
				// Reset for the next character
				currentChar = input.charAt(i);
				count = 1;
			}
		}

		// Append the last character and its count (if greater than 1)
		output.append(currentChar);
		if (count > 1) {
			output.append(count);
		}

		return output.toString(); // Output: a3b3acfw3
	}
}