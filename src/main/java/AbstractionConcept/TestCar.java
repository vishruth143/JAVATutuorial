package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		System.out.println(b.wheels);
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		
		Car c= new BMW();
		System.out.println(c.wheels);
		c.start();
		c.stop();
		c.refuel();		
	}
}
