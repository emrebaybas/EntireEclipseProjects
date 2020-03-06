package Constructors;

public class Car {

	String make;
	String color;
	double engineSize;
	int passengerNumber;

	public Car() {
		this("not entered", "not entered");
	}

	public Car(String maker, String vehicleColor) {
		this.make = maker;
		this.color = vehicleColor;
	}

}
