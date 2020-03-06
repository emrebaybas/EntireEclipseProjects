package Tutorial1;

public class ForLoopFahrenheitToCelcius {

	public static void main(String[] args) {
		
		System.out.println("Fahrenheit \tCelsius");
		
		for (double fahr = 0; fahr <= 300; fahr += 20) {
			double cels = (fahr - 32) * 5 / 9;
			System.out.println(fahr + "\t\t" + cels);

		}
	}
}
