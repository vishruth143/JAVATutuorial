package com.java;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class DuplicateElements {
	public static void main(String[] args) {
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		
		//1. Compare each element: O(nxn) --worst solution
		for(int i=0; i<names.length; i++ ) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is: "+names[i]);
				}
			}
		}
		
		System.out.println("******************");
		
		//2. Using Java Collection HashSet: Its stores unique values: O(n)
		Set<String> store = new HashSet<String>();
		for (String name:names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate element is: "+name);
			}
		}
		
		System.out.println("******************");
		
		//3. Using Java Collection HashMap: Its stores unique values: O(n)
		Map<String, Integer> storemap = new HashMap<String, Integer>();
		for(String name:names) {
			Integer count = storemap.get(name);
			if(count == null) {
				storemap.put(name, 1);
			}
			else {
				storemap.put(name, ++count);
			}
		}
		
		//Get the values from HashMap
		Set<Entry<String, Integer>> entrySet = storemap.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element is: "+entry.getKey());
			}
		}
	}	
}

