package com.java;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("Inside finalize method");
	}

	public static void main(String[] args) throws InterruptedException {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		f1=null;
		f2=null;
		
		System.gc();
//		Thread.sleep(1000); // Delay to allow GC to run
		
//		Runtime.getRuntime().gc();
//		Thread.sleep(1000);
		
		// Wait for GC to run
        for (int i = 0; i < 10000; i++) {
            System.out.print(""); // Keep the program busy
        }
	}
}
