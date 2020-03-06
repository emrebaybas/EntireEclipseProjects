package p1;



public class VehicleTest {

	public static void main(String[] args) {

		

		Vehicle v1 = new Vehicle();
		v1.maxSpeed = 45;
		v1.numWheels = 3;

		Bicycle v2 = new Bicycle();
		v2.maxSpeed = 30;
		v2.numGears = 10;
		v2.numWheels = 2;
	

		System.out.println(v1);
		System.out.println();
		System.out.println(v2);
		System.out.println();

		Vehicle a1[] = new Vehicle[3];
		a1[0] = new Bicycle(30, 2, 10);
		a1[1] = new Bicycle(20, 2, 3);
		a1[2] = new Vehicle(45, 4);

		
//		for (Vehicle vehicle : a1) {
//			System.out.println(vehicle.toString());
//		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
			

		}
	}
}
