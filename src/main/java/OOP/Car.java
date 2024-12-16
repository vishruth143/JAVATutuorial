package OOP;

public class Car {	
	//Method Hiding
	//We can over load a static method
	//We can't override a static method
	public static void start() {
		System.out.println("Car---start");			
	}
	
	public static void start(int a) {          
    	System.out.println("Car---start"); 
	}
	
	public static void start(String s) {          
    	System.out.println("Car---start"); 
	}
        
	public void stop() {			
		System.out.println("Car---stop");
	}

	public void refuel() {
		System.out.println("Car---refuel");
	}

}
