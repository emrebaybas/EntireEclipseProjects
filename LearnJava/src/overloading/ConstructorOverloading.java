package overloading;

public class ConstructorOverloading {
	
	int engSize;
	double engSizeD;
	int vin;
	
	@Override
	public String toString() {
		return "ConstructorOverloading [engSize=" + engSize + ", engSizeD=" + engSizeD + ", vin=" + vin + "]";
	}

	ConstructorOverloading(int engineSize , int vinNumber ){
		engSize=engineSize;
		vin=vinNumber;
	}
	ConstructorOverloading(double engineSize , int vinNumber ){
		engSizeD=engineSize;
		vin=vinNumber;
	}
	
	public static void main(String[] args) {
	
		ConstructorOverloading c1=new ConstructorOverloading(3, 123456732);
		ConstructorOverloading c2=new ConstructorOverloading(3.6, 123456123);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	
		
	
	}

}
