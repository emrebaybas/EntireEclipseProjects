package Tutorial1;

public class CreatingMethod {

	public static void main(String[] args) {

		System.out.println(areaOfRectangle(6.0, 2.0));
	}

	static double areaOfRectangle(double width, double heigth) {
		double area = width * heigth;
		return area;
	}
}
//Just Created a method myself and 
//used it inside the main method by calling it with its name