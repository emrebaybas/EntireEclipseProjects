package Constructors;

public class CarObjects {

	public static void main(String[] args) {

		Car car1 = new Car("Nissan", "blue");
		car1.engineSize = 3.6;
		car1.passengerNumber = 5;
		System.out.println(car1.make);
		System.out.println(car1.color);
		System.out.println(car1.engineSize);
		System.out.println(car1.passengerNumber);

		Car car2 = new Car();
		System.out.println(car2.make);
		System.out.println(car2.color);
		System.out.println(car2.engineSize);
		System.out.println(car2.passengerNumber);

	}
}
