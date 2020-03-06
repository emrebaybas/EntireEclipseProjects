package Tutorial1;

public class CreatingMethodWithStringandInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayHi("Emre", 30);
		sayHi("Kenan", 33);

	}

	public static void sayHi(String name, int age) {
		System.out.println("Hello "+name +". "
				+ "\nYou are now "+age+" years old!");
		
	}
	
}
