package Tutorial1;

public class CreatingMethod1 {

	static double radius;
	static double pi;

	public static void main(String[] args) {
		radius=6;
		pi=3.14;
		System.out.println("Circumference: " + circumference(radius));
		System.out.println("Volume: " + volume(radius));
	}

	static double circumference(double radius) {
		return 2 * radius * pi;
	}

	static double volume(double radius) {
		return (4F / 3F * pi * Math.pow(radius, 3));
	}
}
