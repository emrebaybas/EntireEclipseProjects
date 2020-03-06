package overloading;

public class MethodOverloading {

	
	void add(int a , int b) {
		System.out.println(a+b);
	}	
	
	void add(int a , double b) {
		System.out.println(a+b);
	}
	
	void add(double a , double b) {
		System.out.println(a+b);
	}
	
	void add(int a , int b,int c) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading m=new MethodOverloading();
		m.add(10 , 5 , 4 );
		
		
		
		
		
		
		
		
		
	}

}
