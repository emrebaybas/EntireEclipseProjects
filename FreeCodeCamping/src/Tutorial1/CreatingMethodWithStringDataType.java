package Tutorial1;

public class CreatingMethodWithStringDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayHi("Emre");
		sayHi("Kevin");
		sayHi("John");
	}
	public static void sayHi(String name) {
		System.out.println("Hello "+name);
		//We created the method down here with string name 
		//and we can call the method in the main method by sayHi("anyname");
	}

}
