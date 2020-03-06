package overriding;

class Bank{
	
	double rateOfInterest() {
		return 0;
	}
}

class Citi extends Bank{
	
	double rateOfInterest() {
		return 10.5;
	}
}

class Bofa extends Bank{
	
	double rateOfInterest() {
		return 5.5;
	}
}

class Cp1 extends Bank{
	
	double rateOfInterest() {
		return 22.5;
	}
}

public class OverRiding1 {

	public static void main(String[] args) {
		
		
		Citi b1=new Citi();
		System.out.println(b1.rateOfInterest());
		
		Bofa b2=new Bofa();
		System.out.println(b2.rateOfInterest());
		
		Cp1 b3=new Cp1();
		System.out.println(b3.rateOfInterest());
		
	

	}

}
