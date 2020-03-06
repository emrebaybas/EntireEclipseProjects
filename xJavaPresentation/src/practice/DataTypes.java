package practice;

public class DataTypes {
	
	static int x; //FIELD

	public static void main(String[] args) {
	
		//Primitive Data Types

		
		
		byte a=1;
		short b=12;
		int c=123456;
		long d=123456789;
		
		double e=3.24;
		float f=3.234567f;
		
		char g='a';
		
		boolean h=true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	
		System.out.println(x);         //field default int value=0
		
		
		//System.out.println(m);     // m is a local  variable for calculate method we cannot access to it.
		
	}
	
	static void calculate(){
		 int m=1;
		
	}
}
