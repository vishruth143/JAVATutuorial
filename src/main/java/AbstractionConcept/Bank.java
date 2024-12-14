package AbstractionConcept;

public abstract class Bank {
	
	int amount = 100;
	final int rate = 10;
	static int loadRate = 5;
	
	//Cannot create the object of abstract classes
	//Partial abstraction
	//hiding the implementation logic is called abstraction
	//We can have multiple abstract methods and multiple non-abstarct methods
	//We should have at least one abstarct method
	
	public abstract void loan(); //abstrct method no method body
	
	public void credit() {
		System.out.println("Bank-- credit"); //non-abstract method with body
	}
	
	public void debit() {
		System.out.println("Bank-- debit"); //non-abstract method with body
	}
}
