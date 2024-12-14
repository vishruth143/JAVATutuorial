package AbstractionConcept;

public interface Car {
	
	int wheels = 4;
	
	//In interface we have only abstract methods
	//no method body
	//only method declaration
	//We achieve 100% abstraction
	//cannot create the object of interface
	//In interface only final and static variables
	
	public void start();
	public void stop();
	public void refuel();
}
	