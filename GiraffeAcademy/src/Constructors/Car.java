package Constructors;

public class Car {

	String make;
	String color;
	double engineSize;
	int passengerNumber;

	public Car() {
		this("not entered", "not entered");
	}

	public Car(String make, String color) {
		this.make = make;
		this.color =color;
	}

}
