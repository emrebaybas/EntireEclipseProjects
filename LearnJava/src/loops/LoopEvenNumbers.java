package loops;

public class LoopEvenNumbers {

	public static void main(String[] args) {

		int i = 0;

		while (i <= 10) {
			System.out.println(i);
			i += 2;
			// or i=i+2 so this will print even numbers if you define i=even number first
			// if you define first i=odd number it will print odd numbers until loop
			// condition is met which is i<=10
		}
	}
}
