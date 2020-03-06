package Tutorial1;

public class CalculateFibonacciNumbers {

	public static void main(String[] args) {


		
		int f0 = 0;
		int f1 = 1;
		System.out.println(0);
		System.out.println(1);

		for (int i = 2; i < 20; i++) {
			int fib = f0 + f1;
			System.out.println(fib);
			f0 = f1;
			f1 = fib;
		}
	}
}
