package Tutorial1;

public class WhileLoopFahrenheitCelsius {
	public static void main(String[] args) {

		double fahr = 0;
		double celc = 0;
		System.out.println("Fahrenheit\tCelsius");

		while (fahr <= 300) {
			celc =((fahr-32)*5/9);
			System.out.println(fahr + "\t\t" + celc);
			fahr += 20;
		}
	}
}
