package Tutorial1;

public class CreatingMethod2 {

	static double celsius;
	static double fahrenheit;

	public static void main(String[] args) {
		celsius = 100;
		fahrenheit = 100;
		System.out.println("Fahrenheit: " + toFahrenheit(celsius));
		System.out.println("Celsius: " + toCelsius(fahrenheit));
		System.out.println(toCelsius(100F));
	}

	static double toCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5F / 9F;
	}

	static double toFahrenheit(double celsius) {
		return (1.8F * celsius) + 32F;
	}
}
