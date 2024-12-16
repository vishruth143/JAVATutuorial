package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersInaString {

	public static void main(String[] args) {
		String s = "leetcode";
		
		char[] charArray = s.toCharArray();
		
		Map<Character, Integer> storemap = new HashMap<Character, Integer>();
		for(char ch:charArray) {			
			Integer count = storemap.get(ch);
			if (count == null) {
				storemap.put(ch, 1);
			}else {
				storemap.put(ch, ++count);
			}
		}
		
		System.out.println(storemap);	
		
		Set<Entry<Character, Integer>> entryset = storemap.entrySet();
		for(Entry<Character, Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
