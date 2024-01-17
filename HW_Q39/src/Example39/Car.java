package Example39;
//multiple inherit

public class Car implements Engines,Wheels {
	public void start() {
		System.out.println("Car starts");
	}

	public void roll() {
		System.out.println("Wheels roll");
	}
	public static void main(String[] args) {
		Car myCar = new Car();

        // Calling the start() method
        myCar.start();

        // Calling the roll() method
        myCar.roll();;
		
	}
}
